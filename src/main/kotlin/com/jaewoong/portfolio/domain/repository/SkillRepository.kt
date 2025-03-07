package com.jaewoong.portfolio.domain.repository

import com.jaewoong.portfolio.domain.entity.Skill
import org.springframework.data.jpa.repository.JpaRepository

interface SkillRepository : JpaRepository<Skill, Long>