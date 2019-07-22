(ns com.google.cloud.storage.contrib.nio.CloudStoragePath
  "Google Cloud Storage Path."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.storage.contrib.nio CloudStoragePath]))

(defn resolve-sibling
  "other - `java.nio.file.Path`

  returns: `com.google.cloud.storage.contrib.nio.CloudStoragePath`"
  (^com.google.cloud.storage.contrib.nio.CloudStoragePath [^CloudStoragePath this ^java.nio.file.Path other]
    (-> this (.resolveSibling other))))

(defn get-file-name
  "returns: `com.google.cloud.storage.contrib.nio.CloudStoragePath`"
  (^com.google.cloud.storage.contrib.nio.CloudStoragePath [^CloudStoragePath this]
    (-> this (.getFileName))))

(defn to-absolute-path
  "Changes relative path to be absolute, using workingDirectory as current dir.

  returns: `com.google.cloud.storage.contrib.nio.CloudStoragePath`"
  (^com.google.cloud.storage.contrib.nio.CloudStoragePath [^CloudStoragePath this]
    (-> this (.toAbsolutePath))))

(defn normalize
  "Returns path without extra slashes or . and .. and preserves trailing slash.

  returns: `com.google.cloud.storage.contrib.nio.CloudStoragePath`"
  (^com.google.cloud.storage.contrib.nio.CloudStoragePath [^CloudStoragePath this]
    (-> this (.normalize))))

(defn to-file
  "Throws UnsupportedOperationException because Google Cloud Storage files are not backed
   by the local file system.

  returns: `java.io.File`"
  (^java.io.File [^CloudStoragePath this]
    (-> this (.toFile))))

(defn resolve
  "object - `java.nio.file.Path`

  returns: `com.google.cloud.storage.contrib.nio.CloudStoragePath`"
  (^com.google.cloud.storage.contrib.nio.CloudStoragePath [^CloudStoragePath this ^java.nio.file.Path object]
    (-> this (.resolve object))))

(defn get-file-system
  "returns: `com.google.cloud.storage.contrib.nio.CloudStorageFileSystem`"
  (^com.google.cloud.storage.contrib.nio.CloudStorageFileSystem [^CloudStoragePath this]
    (-> this (.getFileSystem))))

(defn bucket
  "Returns the Cloud Storage bucket name being served by this file system.

  returns: `java.lang.String`"
  (^java.lang.String [^CloudStoragePath this]
    (-> this (.bucket))))

(defn ends-with
  "other - `java.nio.file.Path`

  returns: `boolean`"
  (^Boolean [^CloudStoragePath this ^java.nio.file.Path other]
    (-> this (.endsWith other))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^CloudStoragePath this]
    (-> this (.toString))))

(defn to-real-path
  "Returns this path rewritten to the Cloud Storage object name that'd be used to perform i/o.

   This method makes path absolute and removes the prefix slash from
   the absolute path when stripPrefixSlash is
   true.

  options - `java.nio.file.LinkOption`

  returns: `com.google.cloud.storage.contrib.nio.CloudStoragePath`

  throws: java.lang.IllegalArgumentException - if path contains extra slashes or dot-dirs when permitEmptyPathComponents is false, or if the resulting path is empty."
  (^com.google.cloud.storage.contrib.nio.CloudStoragePath [^CloudStoragePath this ^java.nio.file.LinkOption options]
    (-> this (.toRealPath options))))

(defn iterator
  "returns: `java.util.Iterator<java.nio.file.Path>`"
  (^java.util.Iterator [^CloudStoragePath this]
    (-> this (.iterator))))

(defn to-uri
  "returns: `java.net.URI`"
  (^java.net.URI [^CloudStoragePath this]
    (-> this (.toUri))))

(defn get-name
  "index - `int`

  returns: `com.google.cloud.storage.contrib.nio.CloudStoragePath`"
  (^com.google.cloud.storage.contrib.nio.CloudStoragePath [^CloudStoragePath this ^Integer index]
    (-> this (.getName index))))

(defn get-parent
  "returns: `com.google.cloud.storage.contrib.nio.CloudStoragePath`"
  (^com.google.cloud.storage.contrib.nio.CloudStoragePath [^CloudStoragePath this]
    (-> this (.getParent))))

(defn subpath
  "begin-index - `int`
  end-index - `int`

  returns: `com.google.cloud.storage.contrib.nio.CloudStoragePath`"
  (^com.google.cloud.storage.contrib.nio.CloudStoragePath [^CloudStoragePath this ^Integer begin-index ^Integer end-index]
    (-> this (.subpath begin-index end-index))))

(defn get-root
  "returns: `com.google.cloud.storage.contrib.nio.CloudStoragePath`"
  (^com.google.cloud.storage.contrib.nio.CloudStoragePath [^CloudStoragePath this]
    (-> this (.getRoot))))

(defn register
  "Throws UnsupportedOperationException because this feature hasn't been implemented yet.

  watcher - `java.nio.file.WatchService`
  events - `java.nio.file.WatchEvent$Kind[]`
  modifiers - `java.nio.file.WatchEvent$Modifier`

  returns: `java.nio.file.WatchKey`"
  (^java.nio.file.WatchKey [^CloudStoragePath this ^java.nio.file.WatchService watcher events ^java.nio.file.WatchEvent$Modifier modifiers]
    (-> this (.register watcher events modifiers)))
  (^java.nio.file.WatchKey [^CloudStoragePath this ^java.nio.file.WatchService watcher ^java.nio.file.WatchEvent$Kind events]
    (-> this (.register watcher events))))

(defn starts-with
  "other - `java.nio.file.Path`

  returns: `boolean`"
  (^Boolean [^CloudStoragePath this ^java.nio.file.Path other]
    (-> this (.startsWith other))))

(defn hash-code
  "returns: `int`"
  (^Integer [^CloudStoragePath this]
    (-> this (.hashCode))))

(defn get-name-count
  "returns: `int`"
  (^Integer [^CloudStoragePath this]
    (-> this (.getNameCount))))

(defn compare-to
  "other - `java.nio.file.Path`

  returns: `int`"
  (^Integer [^CloudStoragePath this ^java.nio.file.Path other]
    (-> this (.compareTo other))))

(defn relativize
  "object - `java.nio.file.Path`

  returns: `com.google.cloud.storage.contrib.nio.CloudStoragePath`"
  (^com.google.cloud.storage.contrib.nio.CloudStoragePath [^CloudStoragePath this ^java.nio.file.Path object]
    (-> this (.relativize object))))

(defn equals
  "other - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^CloudStoragePath this ^java.lang.Object other]
    (-> this (.equals other))))

(defn absolute?
  "returns: `boolean`"
  (^Boolean [^CloudStoragePath this]
    (-> this (.isAbsolute))))

