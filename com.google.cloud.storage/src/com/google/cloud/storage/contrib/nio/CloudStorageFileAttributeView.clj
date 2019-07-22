(ns com.google.cloud.storage.contrib.nio.CloudStorageFileAttributeView
  "Metadata view for a Google Cloud Storage object."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.storage.contrib.nio CloudStorageFileAttributeView]))

(defn name
  "Returns .

  returns: `java.lang.String`"
  (^java.lang.String [^CloudStorageFileAttributeView this]
    (-> this (.name))))

(defn read-attributes
  "returns: `com.google.cloud.storage.contrib.nio.CloudStorageFileAttributes`

  throws: java.io.IOException"
  (^com.google.cloud.storage.contrib.nio.CloudStorageFileAttributes [^CloudStorageFileAttributeView this]
    (-> this (.readAttributes))))

(defn set-times
  "This feature is not supported, since Cloud Storage objects are immutable.

  last-modified-time - `java.nio.file.attribute.FileTime`
  last-access-time - `java.nio.file.attribute.FileTime`
  create-time - `java.nio.file.attribute.FileTime`"
  ([^CloudStorageFileAttributeView this ^java.nio.file.attribute.FileTime last-modified-time ^java.nio.file.attribute.FileTime last-access-time ^java.nio.file.attribute.FileTime create-time]
    (-> this (.setTimes last-modified-time last-access-time create-time))))

(defn equals
  "other - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^CloudStorageFileAttributeView this ^java.lang.Object other]
    (-> this (.equals other))))

(defn hash-code
  "returns: `int`"
  (^Integer [^CloudStorageFileAttributeView this]
    (-> this (.hashCode))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^CloudStorageFileAttributeView this]
    (-> this (.toString))))

