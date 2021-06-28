package com.polozov.eshopheroku.service;

import com.polozov.eshopheroku.domain.Bucket;
import com.polozov.eshopheroku.domain.User;
import com.polozov.eshopheroku.dto.BucketDto;

import java.util.List;

public interface BucketService {
    Bucket createBucket(User user, List<Long> productIds);

    void addProducts(Bucket bucket, List<Long> productIds);

    BucketDto getBucketByUser(String name);
    void commitBucketToOrder(String username);
}
