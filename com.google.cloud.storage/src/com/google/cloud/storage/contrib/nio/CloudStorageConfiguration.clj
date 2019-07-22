(ns com.google.cloud.storage.contrib.nio.CloudStorageConfiguration
  "Configuration for CloudStorageFileSystem instances."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.storage.contrib.nio CloudStorageConfiguration]))

(def *-default
  "Static Constant.

  type: com.google.cloud.storage.contrib.nio.CloudStorageConfiguration"
  CloudStorageConfiguration/DEFAULT)

(defn *builder
  "Creates a new builder, initialized with the following settings:


     Performing I/O on paths with extra slashes, e.g. a//b will throw an error.
     The prefix slash on absolute paths will be removed when converting to an object name.
     Pseudo-directories are enabled, so any path with a trailing slash is a fake directory.
     Channel re-opens are disabled.

  returns: `com.google.cloud.storage.contrib.nio.CloudStorageConfiguration$Builder`"
  (^com.google.cloud.storage.contrib.nio.CloudStorageConfiguration$Builder []
    (CloudStorageConfiguration/builder )))

(defn working-directory
  "Returns path of current working directory. This defaults to the root directory.

  returns: `java.lang.String`"
  (^java.lang.String [^CloudStorageConfiguration this]
    (-> this (.workingDirectory))))

(defn user-project
  "Returns the project to be billed when accessing buckets. Leave empty for normal semantics, set
   to bill that project (project you own) for all accesses. This is required for accessing
   requester-pays buckets. This value cannot be null.

  returns: `java.lang.String`"
  (^java.lang.String [^CloudStorageConfiguration this]
    (-> this (.userProject))))

(defn strip-prefix-slash
  "Returns true if '/' prefix on absolute object names should be removed before I/O.

   If you disable this feature, please take into consideration that all paths created from a
   URI will have the leading slash.

  returns: `boolean`"
  (^Boolean [^CloudStorageConfiguration this]
    (-> this (.stripPrefixSlash))))

(defn use-pseudo-directories
  "Returns true if directories and paths with a trailing slash should be treated as fake
   directories.

   With this feature, if file \"foo/bar.txt\" exists then both \"foo\" and \"foo/\" will be treated
   as if they were existing directories.

  returns: `boolean`"
  (^Boolean [^CloudStorageConfiguration this]
    (-> this (.usePseudoDirectories))))

(defn use-user-project-only-for-requester-pays-buckets
  "Returns whether userProject will be cleared for non-requester-pays buckets. That is, if false
   (the default value), setting userProject causes that project to be billed regardless of whether
   the bucket is requester-pays or not. If true, setting userProject will only cause that project
   to be billed when the project is requester-pays.

   Setting this will cause the bucket to be accessed when the CloudStorageFileSystem object is
   created.

  returns: `boolean`"
  (^Boolean [^CloudStorageConfiguration this]
    (-> this (.useUserProjectOnlyForRequesterPaysBuckets))))

(defn retryable-http-codes
  "Returns the set of HTTP error codes that will be retried, in addition to the normally retryable
   ones.

  returns: `com.google.common.collect.ImmutableList<java.lang.Integer>`"
  (^com.google.common.collect.ImmutableList [^CloudStorageConfiguration this]
    (-> this (.retryableHttpCodes))))

(defn block-size
  "Returns block size (in bytes) used when talking to the Google Cloud Storage HTTP server.

  returns: `int`"
  (^Integer [^CloudStorageConfiguration this]
    (-> this (.blockSize))))

(defn permit-empty-path-components
  "Returns true if we shouldn't throw an exception when encountering object names
   containing superfluous slashes, e.g. a//b.

  returns: `boolean`"
  (^Boolean [^CloudStorageConfiguration this]
    (-> this (.permitEmptyPathComponents))))

(defn reopenable-exceptions
  "Returns the set of exceptions for which we'll try a channel reopen if maxChannelReopens is
   positive.

  returns: `com.google.common.collect.ImmutableList<java.lang.Class<? extends java.lang.Exception>>`"
  ([^CloudStorageConfiguration this]
    (-> this (.reopenableExceptions))))

(defn max-channel-reopens
  "Returns the number of times we try re-opening a channel if it's closed unexpectedly while
   reading.

  returns: `int`"
  (^Integer [^CloudStorageConfiguration this]
    (-> this (.maxChannelReopens))))

