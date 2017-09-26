//package pl.xperios.app.data;
//
//import org.springframework.data.querydsl.QueryDslPredicateExecutor;
//import org.springframework.data.querydsl.binding.QuerydslBinderCustomizer;
//import org.springframework.data.querydsl.binding.QuerydslBindings;
//import org.springframework.data.repository.CrudRepository;
//import pl.xperios.app.querydsl.beans.FilmDTO;
//import pl.xperios.app.querydsl.q.QFilm;
//
//public interface FilmRepository
//        extends CrudRepository<FilmDTO, Short>, QueryDslPredicateExecutor<FilmDTO>, QuerydslBinderCustomizer<QFilm> {
//
//    @Override
//    default public void customize(QuerydslBindings bindings, QFilm root) {
//    }
//}