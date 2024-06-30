package Entity;

import java.util.List;

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
@Table(name="Specification")
public class Specification {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Sno")
	private int Sno;
	
	@Column(name = "type")
	private String type;
	
	@Column(name = "engine")
	private String engine;
	
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "specs")
	private Car car;
}
