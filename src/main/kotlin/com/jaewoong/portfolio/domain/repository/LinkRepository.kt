package com.jaewoong.portfolio.domain.repository

import com.jaewoong.portfolio.domain.entity.Link
import org.springframework.data.jpa.repository.JpaRepository

interface LinkRepository : JpaRepository<Link, Long>