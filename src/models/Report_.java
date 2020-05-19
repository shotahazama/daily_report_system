package models;

import java.sql.Date;
import java.sql.Timestamp;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2020-05-19T15:42:04.317+0900")
@StaticMetamodel(Report.class)
public class Report_ {
	public static volatile SingularAttribute<Report, Integer> id;
	public static volatile SingularAttribute<Report, Employee> employee;
	public static volatile SingularAttribute<Report, Date> report_date;
	public static volatile SingularAttribute<Report, String> title;
	public static volatile SingularAttribute<Report, String> content;
	public static volatile SingularAttribute<Report, Timestamp> created_at;
	public static volatile SingularAttribute<Report, Timestamp> updated_at;
}
