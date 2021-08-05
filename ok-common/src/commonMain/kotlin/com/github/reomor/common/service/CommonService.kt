package com.github.reomor.common.service

import com.github.reomor.common.domain.DomainModel

class CommonService {

  fun getSmth(): DomainModel = DomainModel(
    1,
    6.66,
    "Some string"
  )
}
