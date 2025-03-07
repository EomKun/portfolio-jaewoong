package com.jaewoong.portfolio.domain.repository

import com.jaewoong.portfolio.domain.entity.Experience
import org.springframework.data.jpa.repository.JpaRepository

interface ExperienceRepository : JpaRepository<Experience, Long>