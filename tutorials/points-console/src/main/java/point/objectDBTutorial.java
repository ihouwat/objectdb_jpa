package point;
import javax.persistence.*;

// Entity annotation creates entity class. You can add a name attribute as well
@Entity(name = "AnotherName")
public class objectDBTutorial {

    // Embeddable classes can be part of entity classes
    @Embeddable
    class EmbeddedClass {

    }

    @Embeddable
    public static class EntityWithTransientFields {
        static int transient1; // not persistent because of static
        final int transient2 = 0;  // not persistent because of final
        transient int transient3; // not persistent because of transient
        @Transient int transient4; // not persistent because of @Transient
    }

}


// Annotations
@Entity
public class EntityWithFieldSettings {
    @Basic(optional=false) Integer field1; // optional=false throws an exception if the value is 'null'
    @OneToOne(cascade=CascadeType.ALL) MyEntity field2;
    @OneToMany(fetch=FetchType.EAGER) List<MyEntity> field3;
}