package Entity;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Car_Details")
public class Car {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id")
	private int Id;
	
	@Column(name = "Name")
	private String Name;
	
	@Column(name = "price")
	private double price;
	
	@Column(name = "Sno" ,nullable = false)
	private int Sno;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn
	private Specification specs;

}
