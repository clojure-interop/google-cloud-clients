(ns com.google.cloud.storage.contrib.nio.CloudStorageFileSystemProvider
  "Google Cloud Storage FileSystemProvider implementation.

  Note: This class should never be used directly. This class is instantiated by the
  service loader and called through a standardized API, e.g. Files. However
  the javadocs in this class serve as useful documentation for the behavior of the Google Cloud
  Storage NIO library."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.storage.contrib.nio CloudStorageFileSystemProvider]))

(defn ->cloud-storage-file-system-provider
  "Constructor.

  Default constructor which should only be called by Java SPI."
  (^CloudStorageFileSystemProvider []
    (new CloudStorageFileSystemProvider )))

(defn *set-storage-options
  "Sets options that are only used by the constructor.

   Instead of calling this, when possible use CloudStorageFileSystem.forBucket and pass
   StorageOptions as an argument.

  new-storage-options - `com.google.cloud.storage.StorageOptions`"
  ([^com.google.cloud.storage.StorageOptions new-storage-options]
    (CloudStorageFileSystemProvider/setStorageOptions new-storage-options)))

(defn *set-default-cloud-storage-configuration
  "Changes the default configuration for every filesystem object created from here on, including
   via SPI. If null then future filesystem objects will have the factory default configuration.

   If options are specified later then they override the defaults. Methods that take a whole
   CloudStorageConfiguration (eg. CloudStorageFileSystem.forBucket) will completely override the
   defaults. Methods that take individual options (eg.
   CloudStorageFileSystemProvier.newFileSystem) will override only these options; the rest will be
   taken from the defaults specified here.

   This is meant to be done only once, at the beginning of some main program, in order to force
   all libraries to use some settings we like.

   Libraries should never call this. If you're a library then, instead, create your own
   filesystem object with the right configuration and pass it along.

  new-default - new default CloudStorageConfiguration - `com.google.cloud.storage.contrib.nio.CloudStorageConfiguration`"
  ([^com.google.cloud.storage.contrib.nio.CloudStorageConfiguration new-default]
    (CloudStorageFileSystemProvider/setDefaultCloudStorageConfiguration new-default)))

(defn requester-pays
  "bucket-name - the name of the bucket to check - `java.lang.String`

  returns: whether requester pays is enabled for that bucket - `boolean`"
  (^Boolean [^CloudStorageFileSystemProvider this ^java.lang.String bucket-name]
    (-> this (.requesterPays bucket-name))))

(defn with-no-user-project
  "Returns a NEW CloudStorageFileSystemProvider identical to this one, but with userProject
   removed.

   Perhaps you want to call this is you realize you'll be working on a bucket that is not
   requester-pays.

  returns: `com.google.cloud.storage.contrib.nio.CloudStorageFileSystemProvider`"
  (^com.google.cloud.storage.contrib.nio.CloudStorageFileSystemProvider [^CloudStorageFileSystemProvider this]
    (-> this (.withNoUserProject))))

(defn copy
  "source - `java.nio.file.Path`
  target - `java.nio.file.Path`
  options - `java.nio.file.CopyOption`

  throws: java.io.IOException"
  ([^CloudStorageFileSystemProvider this ^java.nio.file.Path source ^java.nio.file.Path target ^java.nio.file.CopyOption options]
    (-> this (.copy source target options))))

(defn get-file-system
  "Returns Cloud Storage file system, provided a URI with no path, e.g. gs://bucket.

  uri - `java.net.URI`

  returns: `com.google.cloud.storage.contrib.nio.CloudStorageFileSystem`"
  (^com.google.cloud.storage.contrib.nio.CloudStorageFileSystem [^CloudStorageFileSystemProvider this ^java.net.URI uri]
    (-> this (.getFileSystem uri))))

(defn delete
  "path - `java.nio.file.Path`

  throws: java.io.IOException"
  ([^CloudStorageFileSystemProvider this ^java.nio.file.Path path]
    (-> this (.delete path))))

(defn read-attributes
  "path - `java.nio.file.Path`
  type - `java.lang.Class`
  options - `java.nio.file.LinkOption`

  returns: `<A extends java.nio.file.attribute.BasicFileAttributes> A`

  throws: java.io.IOException"
  ([^CloudStorageFileSystemProvider this ^java.nio.file.Path path ^java.lang.Class type ^java.nio.file.LinkOption options]
    (-> this (.readAttributes path type options))))

(defn new-file-system
  "Returns Cloud Storage file system, provided a URI, e.g. gs://bucket. The URI can
   include a path component (that will be ignored).

  uri - bucket and current working directory, e.g. gs://bucket - `java.net.URI`
  env - map of configuration options, whose keys correspond to the method names of CloudStorageConfiguration.Builder. However you are not allowed to set the working directory, as that should be provided in the uri - `java.util.Map`

  returns: `com.google.cloud.storage.contrib.nio.CloudStorageFileSystem`

  throws: java.lang.IllegalArgumentException - if uri specifies a port, user, query, or fragment, or if scheme is not"
  (^com.google.cloud.storage.contrib.nio.CloudStorageFileSystem [^CloudStorageFileSystemProvider this ^java.net.URI uri ^java.util.Map env]
    (-> this (.newFileSystem uri env))))

(defn get-project
  "Returns the project that is assigned to this provider.

  returns: `java.lang.String`"
  (^java.lang.String [^CloudStorageFileSystemProvider this]
    (-> this (.getProject))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^CloudStorageFileSystemProvider this]
    (-> this (.toString))))

(defn get-file-attribute-view
  "path - `java.nio.file.Path`
  type - `java.lang.Class`
  options - `java.nio.file.LinkOption`

  returns: `<V extends java.nio.file.attribute.FileAttributeView> V`"
  ([^CloudStorageFileSystemProvider this ^java.nio.file.Path path ^java.lang.Class type ^java.nio.file.LinkOption options]
    (-> this (.getFileAttributeView path type options))))

(defn same-file?
  "path - `java.nio.file.Path`
  path-2 - `java.nio.file.Path`

  returns: `boolean`"
  (^Boolean [^CloudStorageFileSystemProvider this ^java.nio.file.Path path ^java.nio.file.Path path-2]
    (-> this (.isSameFile path path-2))))

(defn get-path
  "Convenience method: replaces spaces with \"%20\", builds a URI, and calls getPath(uri).

  uri-in-string-form - `java.lang.String`

  returns: `com.google.cloud.storage.contrib.nio.CloudStoragePath`"
  (^com.google.cloud.storage.contrib.nio.CloudStoragePath [^CloudStorageFileSystemProvider this ^java.lang.String uri-in-string-form]
    (-> this (.getPath uri-in-string-form))))

(defn check-access
  "path - `java.nio.file.Path`
  modes - `java.nio.file.AccessMode`

  throws: java.io.IOException"
  ([^CloudStorageFileSystemProvider this ^java.nio.file.Path path ^java.nio.file.AccessMode modes]
    (-> this (.checkAccess path modes))))

(defn new-input-stream
  "path - `java.nio.file.Path`
  options - `java.nio.file.OpenOption`

  returns: `java.io.InputStream`

  throws: java.io.IOException"
  (^java.io.InputStream [^CloudStorageFileSystemProvider this ^java.nio.file.Path path ^java.nio.file.OpenOption options]
    (-> this (.newInputStream path options))))

(defn new-file-channel
  "Open a file for reading OR writing. The FileChannel that is returned will only allow
   reads or writes depending on the OpenOptions that are specified. If any of the
   following have been specified, the FileChannel will be write-only: StandardOpenOption.CREATE


     StandardOpenOption.CREATE
     StandardOpenOption.CREATE_NEW
     StandardOpenOption.WRITE
     StandardOpenOption.TRUNCATE_EXISTING


   In all other cases the FileChannel will be read-only.

  path - The path to the file to open or create - `java.nio.file.Path`
  options - The options specifying how the file should be opened, and whether the FileChannel should be read-only or write-only. - `java.util.Set`
  attrs - (not supported, the values will be ignored) - `java.nio.file.attribute.FileAttribute`

  returns: `java.nio.channels.FileChannel`

  throws: java.io.IOException"
  (^java.nio.channels.FileChannel [^CloudStorageFileSystemProvider this ^java.nio.file.Path path ^java.util.Set options ^java.nio.file.attribute.FileAttribute attrs]
    (-> this (.newFileChannel path options attrs))))

(defn delete-if-exists
  "path - `java.nio.file.Path`

  returns: `boolean`

  throws: java.io.IOException"
  (^Boolean [^CloudStorageFileSystemProvider this ^java.nio.file.Path path]
    (-> this (.deleteIfExists path))))

(defn get-scheme
  "returns: `java.lang.String`"
  (^java.lang.String [^CloudStorageFileSystemProvider this]
    (-> this (.getScheme))))

(defn get-file-store
  "Throws UnsupportedOperationException because this feature hasn't been implemented yet.

  path - `java.nio.file.Path`

  returns: `java.nio.file.FileStore`"
  (^java.nio.file.FileStore [^CloudStorageFileSystemProvider this ^java.nio.file.Path path]
    (-> this (.getFileStore path))))

(defn hidden?
  "Always returns false, because Google Cloud Storage doesn't support hidden files.

  path - `java.nio.file.Path`

  returns: `boolean`"
  (^Boolean [^CloudStorageFileSystemProvider this ^java.nio.file.Path path]
    (-> this (.isHidden path))))

(defn set-attribute
  "Throws UnsupportedOperationException because Cloud Storage objects are immutable.

  path - `java.nio.file.Path`
  attribute - `java.lang.String`
  value - `java.lang.Object`
  options - `java.nio.file.LinkOption`"
  ([^CloudStorageFileSystemProvider this ^java.nio.file.Path path ^java.lang.String attribute ^java.lang.Object value ^java.nio.file.LinkOption options]
    (-> this (.setAttribute path attribute value options))))

(defn new-byte-channel
  "Open a file for reading or writing. To read receiver-pays buckets, specify the
   BlobSourceOption.userProject option.

  path - `java.nio.file.Path`
  options - `java.util.Set`
  attrs - `java.nio.file.attribute.FileAttribute`

  returns: `java.nio.channels.SeekableByteChannel`

  throws: java.io.IOException"
  (^java.nio.channels.SeekableByteChannel [^CloudStorageFileSystemProvider this ^java.nio.file.Path path ^java.util.Set options ^java.nio.file.attribute.FileAttribute attrs]
    (-> this (.newByteChannel path options attrs))))

(defn move
  "source - `java.nio.file.Path`
  target - `java.nio.file.Path`
  options - `java.nio.file.CopyOption`

  throws: java.io.IOException"
  ([^CloudStorageFileSystemProvider this ^java.nio.file.Path source ^java.nio.file.Path target ^java.nio.file.CopyOption options]
    (-> this (.move source target options))))

(defn hash-code
  "returns: `int`"
  (^Integer [^CloudStorageFileSystemProvider this]
    (-> this (.hashCode))))

(defn new-directory-stream
  "dir - `java.nio.file.Path`
  filter - `java.nio.file.DirectoryStream$Filter`

  returns: `java.nio.file.DirectoryStream<java.nio.file.Path>`"
  (^java.nio.file.DirectoryStream [^CloudStorageFileSystemProvider this ^java.nio.file.Path dir ^java.nio.file.DirectoryStream$Filter filter]
    (-> this (.newDirectoryStream dir filter))))

(defn create-directory
  "Does nothing since Google Cloud Storage uses fake directories.

  dir - `java.nio.file.Path`
  attrs - `java.nio.file.attribute.FileAttribute`"
  ([^CloudStorageFileSystemProvider this ^java.nio.file.Path dir ^java.nio.file.attribute.FileAttribute attrs]
    (-> this (.createDirectory dir attrs))))

(defn equals
  "other - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^CloudStorageFileSystemProvider this ^java.lang.Object other]
    (-> this (.equals other))))

