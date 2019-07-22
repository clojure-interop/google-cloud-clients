(ns com.google.cloud.storage.contrib.nio.CloudStorageConfiguration$Builder
  "Builder for CloudStorageConfiguration."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.storage.contrib.nio CloudStorageConfiguration$Builder]))

(defn working-directory
  "Changes current working directory for new filesystem. This defaults to the root directory.
   The working directory cannot be changed once it's been set. You'll need to create another
   CloudStorageFileSystem object.

  path - `java.lang.String`

  returns: `com.google.cloud.storage.contrib.nio.CloudStorageConfiguration$Builder`

  throws: java.lang.IllegalArgumentException - if path is not absolute."
  (^com.google.cloud.storage.contrib.nio.CloudStorageConfiguration$Builder [^CloudStorageConfiguration$Builder this ^java.lang.String path]
    (-> this (.workingDirectory path))))

(defn user-project
  "value - `java.lang.String`

  returns: `com.google.cloud.storage.contrib.nio.CloudStorageConfiguration$Builder`"
  (^com.google.cloud.storage.contrib.nio.CloudStorageConfiguration$Builder [^CloudStorageConfiguration$Builder this ^java.lang.String value]
    (-> this (.userProject value))))

(defn strip-prefix-slash
  "Configures if the '/' prefix on absolute object names should be removed before I/O.

   If you disable this feature, please take into consideration that all paths created from a
   URI will have the leading slash.

  value - `boolean`

  returns: `com.google.cloud.storage.contrib.nio.CloudStorageConfiguration$Builder`"
  (^com.google.cloud.storage.contrib.nio.CloudStorageConfiguration$Builder [^CloudStorageConfiguration$Builder this ^Boolean value]
    (-> this (.stripPrefixSlash value))))

(defn use-pseudo-directories
  "Configures if paths with a trailing slash should be treated as fake directories.

  value - `boolean`

  returns: `com.google.cloud.storage.contrib.nio.CloudStorageConfiguration$Builder`"
  (^com.google.cloud.storage.contrib.nio.CloudStorageConfiguration$Builder [^CloudStorageConfiguration$Builder this ^Boolean value]
    (-> this (.usePseudoDirectories value))))

(defn auto-detect-requester-pays
  "value - `boolean`

  returns: `com.google.cloud.storage.contrib.nio.CloudStorageConfiguration$Builder`"
  (^com.google.cloud.storage.contrib.nio.CloudStorageConfiguration$Builder [^CloudStorageConfiguration$Builder this ^Boolean value]
    (-> this (.autoDetectRequesterPays value))))

(defn build
  "Creates new instance without destroying builder.

  returns: `com.google.cloud.storage.contrib.nio.CloudStorageConfiguration`"
  (^com.google.cloud.storage.contrib.nio.CloudStorageConfiguration [^CloudStorageConfiguration$Builder this]
    (-> this (.build))))

(defn retryable-http-codes
  "value - `com.google.common.collect.ImmutableList`

  returns: `com.google.cloud.storage.contrib.nio.CloudStorageConfiguration$Builder`"
  (^com.google.cloud.storage.contrib.nio.CloudStorageConfiguration$Builder [^CloudStorageConfiguration$Builder this ^com.google.common.collect.ImmutableList value]
    (-> this (.retryableHttpCodes value))))

(defn block-size
  "Sets the block size in bytes that should be used for each HTTP request to the API.

   The default is .

  value - `int`

  returns: `com.google.cloud.storage.contrib.nio.CloudStorageConfiguration$Builder`"
  (^com.google.cloud.storage.contrib.nio.CloudStorageConfiguration$Builder [^CloudStorageConfiguration$Builder this ^Integer value]
    (-> this (.blockSize value))))

(defn permit-empty-path-components
  "Configures whether or not we should throw an exception when encountering object names
   containing superfluous slashes, e.g. a//b.

  value - `boolean`

  returns: `com.google.cloud.storage.contrib.nio.CloudStorageConfiguration$Builder`"
  (^com.google.cloud.storage.contrib.nio.CloudStorageConfiguration$Builder [^CloudStorageConfiguration$Builder this ^Boolean value]
    (-> this (.permitEmptyPathComponents value))))

(defn reopenable-exceptions
  "values - `com.google.common.collect.ImmutableList`

  returns: `com.google.cloud.storage.contrib.nio.CloudStorageConfiguration$Builder`"
  (^com.google.cloud.storage.contrib.nio.CloudStorageConfiguration$Builder [^CloudStorageConfiguration$Builder this ^com.google.common.collect.ImmutableList values]
    (-> this (.reopenableExceptions values))))

(defn max-channel-reopens
  "value - `int`

  returns: `com.google.cloud.storage.contrib.nio.CloudStorageConfiguration$Builder`"
  (^com.google.cloud.storage.contrib.nio.CloudStorageConfiguration$Builder [^CloudStorageConfiguration$Builder this ^Integer value]
    (-> this (.maxChannelReopens value))))

