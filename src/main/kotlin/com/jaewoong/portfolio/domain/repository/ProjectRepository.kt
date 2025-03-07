package com.jaewoong.portfolio.domain.repository

import com.jaewoong.portfolio.domain.entity.Project
import org.springframework.data.jpa.repository.JpaRepository

interface ProjectRepository : JpaRepository<Project, Long>