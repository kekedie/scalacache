package com.github.cb372.cache.guava

import org.joda.time.DateTime

/**
 * A cache entry with an optional expiry time
 */
case class Entry[+A](value: A, expiresAt: Option[DateTime]) {

  /**
   * Has the entry expired yet?
   */
  def isExpired: Boolean = expiresAt.exists(_.isBeforeNow)

}
