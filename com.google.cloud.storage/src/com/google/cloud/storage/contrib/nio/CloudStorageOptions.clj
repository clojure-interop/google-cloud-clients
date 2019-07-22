(ns com.google.cloud.storage.contrib.nio.CloudStorageOptions
  "Helper class for specifying options when opening and copying Cloud Storage files."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.storage.contrib.nio CloudStorageOptions]))

(defn *with-user-metadata
  "Sets an unmodifiable piece of user metadata on a Cloud Storage object.

  key - `java.lang.String`
  value - `java.lang.String`

  returns: `com.google.cloud.storage.contrib.nio.CloudStorageOption$OpenCopy`"
  (^com.google.cloud.storage.contrib.nio.CloudStorageOption$OpenCopy [^java.lang.String key ^java.lang.String value]
    (CloudStorageOptions/withUserMetadata key value)))

(defn *with-content-disposition
  "Sets the Content-Disposition HTTP header on an object.

  content-disposition - `java.lang.String`

  returns: `com.google.cloud.storage.contrib.nio.CloudStorageOption$OpenCopy`"
  (^com.google.cloud.storage.contrib.nio.CloudStorageOption$OpenCopy [^java.lang.String content-disposition]
    (CloudStorageOptions/withContentDisposition content-disposition)))

(defn *with-content-encoding
  "Sets the Content-Encoding HTTP header on an object.

  content-encoding - `java.lang.String`

  returns: `com.google.cloud.storage.contrib.nio.CloudStorageOption$OpenCopy`"
  (^com.google.cloud.storage.contrib.nio.CloudStorageOption$OpenCopy [^java.lang.String content-encoding]
    (CloudStorageOptions/withContentEncoding content-encoding)))

(defn *with-block-size
  "Sets the block size (in bytes) when talking to the Google Cloud Storage server.

   The default is .

  size - `int`

  returns: `com.google.cloud.storage.contrib.nio.CloudStorageOption$OpenCopy`"
  (^com.google.cloud.storage.contrib.nio.CloudStorageOption$OpenCopy [^Integer size]
    (CloudStorageOptions/withBlockSize size)))

(defn *with-acl
  "Sets the ACL value on a Cloud Storage object.

  acl - `com.google.cloud.storage.Acl`

  returns: `com.google.cloud.storage.contrib.nio.CloudStorageOption$OpenCopy`"
  (^com.google.cloud.storage.contrib.nio.CloudStorageOption$OpenCopy [^com.google.cloud.storage.Acl acl]
    (CloudStorageOptions/withAcl acl)))

(defn *without-caching
  "Disables caching on an object. Same as: withCacheControl(\"no-cache\").

  returns: `com.google.cloud.storage.contrib.nio.CloudStorageOption$OpenCopy`"
  (^com.google.cloud.storage.contrib.nio.CloudStorageOption$OpenCopy []
    (CloudStorageOptions/withoutCaching )))

(defn *with-channel-reopen
  "Sets the max number of times that the channel can be reopened if reading fails because the
   channel unexpectedly closes.

   The default is 0.

  count - `int`

  returns: `com.google.cloud.storage.contrib.nio.CloudStorageOption$OpenCopy`"
  (^com.google.cloud.storage.contrib.nio.CloudStorageOption$OpenCopy [^Integer count]
    (CloudStorageOptions/withChannelReopen count)))

(defn *with-mime-type
  "Sets the mime type header on an object, e.g. \"text/plain\".

  mime-type - `java.lang.String`

  returns: `com.google.cloud.storage.contrib.nio.CloudStorageOption$OpenCopy`"
  (^com.google.cloud.storage.contrib.nio.CloudStorageOption$OpenCopy [^java.lang.String mime-type]
    (CloudStorageOptions/withMimeType mime-type)))

(defn *with-cache-control
  "Sets the Cache-Control HTTP header on an object.

  cache-control - `java.lang.String`

  returns: `com.google.cloud.storage.contrib.nio.CloudStorageOption$OpenCopy`"
  (^com.google.cloud.storage.contrib.nio.CloudStorageOption$OpenCopy [^java.lang.String cache-control]
    (CloudStorageOptions/withCacheControl cache-control)))

