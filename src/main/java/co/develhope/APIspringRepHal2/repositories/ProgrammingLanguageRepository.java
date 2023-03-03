package co.develhope.APIspringRepHal2.repositories;

import co.develhope.APIspringRepHal2.entities.ProgrammingLanguage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.Description;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(path = "repo-prog-languages",itemResourceDescription =@Description("Boh non so che mettere"))
public interface ProgrammingLanguageRepository extends JpaRepository<ProgrammingLanguage,Long> {
}
