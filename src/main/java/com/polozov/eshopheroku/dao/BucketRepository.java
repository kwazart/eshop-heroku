package com.polozov.eshopheroku.dao;

import com.polozov.eshopheroku.domain.Bucket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BucketRepository extends JpaRepository<Bucket, Long> {
}
