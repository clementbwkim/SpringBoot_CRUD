package com.springboot.study.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.study.model.Note;

public interface NoteRepository extends JpaRepository<Note, Long> {

}
