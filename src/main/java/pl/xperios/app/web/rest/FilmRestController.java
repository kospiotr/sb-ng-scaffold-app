package pl.xperios.app.web.rest;

import com.querydsl.core.types.Predicate;
import com.querydsl.sql.SQLQuery;
import com.querydsl.sql.SQLQueryFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.data.querydsl.binding.QuerydslPredicate;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pl.xperios.app.querydsl.q.Film;
import pl.xperios.app.querydsl.q.QFilm;

import javax.inject.Inject;

@Transactional
@RestController
@RequestMapping(path = "/api/film")
public class FilmRestController {

    @Inject
    private SQLQueryFactory sqlQueryFactory;

    @GetMapping
    public Page<Film> findAll(@QuerydslPredicate(root = Film.class) Predicate predicate,
                              Pageable pageable,
                              @RequestParam MultiValueMap<String, String> parameters) {

        SQLQuery<Film> query = sqlQueryFactory
                .select(QFilm.film)
                .from(QFilm.film)
                .where(predicate);

        SQLQuery<Film> pageQuery = query
                .offset(pageable.getOffset())
                .limit(pageable.getPageSize());

        return new PageImpl<>(pageQuery.fetch(), pageable, query.fetchCount());
    }

}
