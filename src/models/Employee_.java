package models;

import java.sql.Timestamp;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2020-05-19T15:42:04.274+0900")
@StaticMetamodel(Employee.class)
public class Employee_ {
	public static volatile SingularAttribute<Employee, Integer> id;
	public static volatile SingularAttribute<Employee, String> code;
	public static volatile SingularAttribute<Employee, String> name;
	public static volatile SingularAttribute<Employee, String> password;
	public static volatile SingularAttribute<Employee, Integer> admin_flag;
	public static volatile SingularAttribute<Employee, Timestamp> created_at;
	public static volatile SingularAttribute<Employee, Timestamp> updated_at;
	public static volatile SingularAttribute<Employee, Integer> delete_flag;
}
