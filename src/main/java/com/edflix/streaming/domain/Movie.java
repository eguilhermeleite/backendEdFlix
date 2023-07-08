package com.edflix.streaming.domain;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class Movie implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@EqualsAndHashCode.Include
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
    private String title;
    private String duration;
    private String releaseYear;
    private String rating;
    private String urlCard;
    private String urlDetail;
    private Director director;
 
    /*
    @Setter(AccessLevel.NONE)
    private Set<Gender> genders = new HashSet<>();
    
    @Setter(AccessLevel.NONE)
    private Set<Interpreter> interpreters = new HashSet<>();
    */
}
