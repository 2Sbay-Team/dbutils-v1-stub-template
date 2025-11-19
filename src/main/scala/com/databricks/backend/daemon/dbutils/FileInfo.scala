package com.databricks.backend.daemon.dbutils

case class FileInfo(
  path: String = "",
  name: String = "",
  size: Long = 0L,
  isDir: Boolean = false
)
