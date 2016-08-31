package com.chyld.repositories;

import com.chyld.entities.Profile;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IProfileRepository extends PagingAndSortingRepository<Profile, Integer>{
}
