(ns com.google.cloud.storage.contrib.nio.CloudStorageFileSystem
  "Google Cloud Storage FileSystem implementation."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.storage.contrib.nio CloudStorageFileSystem]))

(def *-uri-scheme
  "Static Constant.

  type: java.lang.String"
  CloudStorageFileSystem/URI_SCHEME)

(def *-gcs-view
  "Static Constant.

  type: java.lang.String"
  CloudStorageFileSystem/GCS_VIEW)

(def *-basic-view
  "Static Constant.

  type: java.lang.String"
  CloudStorageFileSystem/BASIC_VIEW)

(def *-block-size-default
  "Static Constant.

  type: int"
  CloudStorageFileSystem/BLOCK_SIZE_DEFAULT)

(def *-file-time-unknown
  "Static Constant.

  type: java.nio.file.attribute.FileTime"
  CloudStorageFileSystem/FILE_TIME_UNKNOWN)

(def *-supported-views
  "Static Constant.

  type: java.util.Set<java.lang.String>"
  CloudStorageFileSystem/SUPPORTED_VIEWS)

(defn *list-buckets
  "Lists the project's buckets. Pass \"null\" to use the default project.

   Example of listing buckets, specifying the page size and a name prefix.



   String prefix = \"bucket_\";
   Page<Bucket> buckets = CloudStorageFileSystem.listBuckets(\"my-project\", BucketListOption.prefix(prefix));
   Iterator<Bucket> bucketIterator = buckets.iterateAll();
   while (bucketIterator.hasNext()) {
     Bucket bucket = bucketIterator.next();
     // do something with the bucket
   }

  project - `java.lang.String`
  options - `com.google.cloud.storage.Storage$BucketListOption`

  returns: `com.google.api.gax.paging.Page<com.google.cloud.storage.Bucket>`

  throws: com.google.cloud.storage.StorageException - upon failure"
  (^com.google.api.gax.paging.Page [^java.lang.String project ^com.google.cloud.storage.Storage$BucketListOption options]
    (CloudStorageFileSystem/listBuckets project options)))

(defn *for-bucket
  "Returns Google Cloud Storage FileSystem object for bucket.

   Google Cloud Storage file system objects are basically free. You can create as many as you
   want, even if you have multiple instances for the same bucket. There's no actual system
   resources associated with this object. Therefore calling close() on the returned value
   is optional.

   Note: It is also possible to instantiate this class via Java's FileSystems.getFileSystem(URI.create(\"gs://bucket\")). We discourage you from using that if
   possible, for the reasons documented in CloudStorageFileSystemProvider.newFileSystem(URI, java.util.Map)

  bucket - `java.lang.String`
  config - `com.google.cloud.storage.contrib.nio.CloudStorageConfiguration`
  storage-options - `com.google.cloud.storage.StorageOptions`

  returns: `com.google.cloud.storage.contrib.nio.CloudStorageFileSystem`"
  (^com.google.cloud.storage.contrib.nio.CloudStorageFileSystem [^java.lang.String bucket ^com.google.cloud.storage.contrib.nio.CloudStorageConfiguration config ^com.google.cloud.storage.StorageOptions storage-options]
    (CloudStorageFileSystem/forBucket bucket config storage-options))
  (^com.google.cloud.storage.contrib.nio.CloudStorageFileSystem [^java.lang.String bucket ^com.google.cloud.storage.contrib.nio.CloudStorageConfiguration config]
    (CloudStorageFileSystem/forBucket bucket config))
  (^com.google.cloud.storage.contrib.nio.CloudStorageFileSystem [^java.lang.String bucket]
    (CloudStorageFileSystem/forBucket bucket)))

(defn config
  "Returns configuration object for this file system instance.

  returns: `com.google.cloud.storage.contrib.nio.CloudStorageConfiguration`"
  (^com.google.cloud.storage.contrib.nio.CloudStorageConfiguration [^CloudStorageFileSystem this]
    (-> this (.config))))

(defn get-root-directories
  "returns: `java.lang.Iterable<java.nio.file.Path>`"
  (^java.lang.Iterable [^CloudStorageFileSystem this]
    (-> this (.getRootDirectories))))

(defn get-path-matcher
  "syntax-and-pattern - `java.lang.String`

  returns: `java.nio.file.PathMatcher`"
  (^java.nio.file.PathMatcher [^CloudStorageFileSystem this ^java.lang.String syntax-and-pattern]
    (-> this (.getPathMatcher syntax-and-pattern))))

(defn get-file-stores
  "Returns nothing because Google Cloud Storage doesn't have disk partitions of limited size, or
   anything similar.

  returns: `java.lang.Iterable<java.nio.file.FileStore>`"
  (^java.lang.Iterable [^CloudStorageFileSystem this]
    (-> this (.getFileStores))))

(defn bucket
  "Returns Cloud Storage bucket name being served by this file system.

  returns: `java.lang.String`"
  (^java.lang.String [^CloudStorageFileSystem this]
    (-> this (.bucket))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^CloudStorageFileSystem this]
    (-> this (.toString))))

(defn get-path
  "Converts Cloud Storage object name to a Path object.

  first - `java.lang.String`
  more - `java.lang.String`

  returns: `com.google.cloud.storage.contrib.nio.CloudStoragePath`"
  (^com.google.cloud.storage.contrib.nio.CloudStoragePath [^CloudStorageFileSystem this ^java.lang.String first ^java.lang.String more]
    (-> this (.getPath first more))))

(defn provider
  "returns: `com.google.cloud.storage.contrib.nio.CloudStorageFileSystemProvider`"
  (^com.google.cloud.storage.contrib.nio.CloudStorageFileSystemProvider [^CloudStorageFileSystem this]
    (-> this (.provider))))

(defn close
  "Does nothing currently. This method might be updated in the future to close all channels
   associated with this file system object. However it's unlikely that even then, calling this
   method will become mandatory.

  throws: java.io.IOException"
  ([^CloudStorageFileSystem this]
    (-> this (.close))))

(defn get-separator
  "Returns .

  returns: `java.lang.String`"
  (^java.lang.String [^CloudStorageFileSystem this]
    (-> this (.getSeparator))))

(defn get-user-principal-lookup-service
  "Throws UnsupportedOperationException because this feature hasn't been implemented yet.

  returns: `java.nio.file.attribute.UserPrincipalLookupService`"
  (^java.nio.file.attribute.UserPrincipalLookupService [^CloudStorageFileSystem this]
    (-> this (.getUserPrincipalLookupService))))

(defn hash-code
  "returns: `int`"
  (^Integer [^CloudStorageFileSystem this]
    (-> this (.hashCode))))

(defn open?
  "Returns true, even if you previously called the close() method.

  returns: `boolean`"
  (^Boolean [^CloudStorageFileSystem this]
    (-> this (.isOpen))))

(defn new-watch-service
  "Throws UnsupportedOperationException because this feature hasn't been implemented yet.

  returns: `java.nio.file.WatchService`

  throws: java.io.IOException"
  (^java.nio.file.WatchService [^CloudStorageFileSystem this]
    (-> this (.newWatchService))))

(defn read-only?
  "Returns false.

  returns: `boolean`"
  (^Boolean [^CloudStorageFileSystem this]
    (-> this (.isReadOnly))))

(defn supported-file-attribute-views
  "returns: `java.util.Set<java.lang.String>`"
  (^java.util.Set [^CloudStorageFileSystem this]
    (-> this (.supportedFileAttributeViews))))

(defn equals
  "other - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^CloudStorageFileSystem this ^java.lang.Object other]
    (-> this (.equals other))))

