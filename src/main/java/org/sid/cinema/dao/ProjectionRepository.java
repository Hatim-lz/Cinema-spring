package org.sid.cinema.dao;

import org.springframework.data.jpa.repository.JpaRepository;


import org.sid.cinema.entities.Projection;

public interface ProjectionRepository extends JpaRepository<Projection, Long> {

}