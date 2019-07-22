(ns com.google.cloud.compute.v1.CustomerEncryptionKeyProtectedDisk$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 CustomerEncryptionKeyProtectedDisk$Builder]))

(defn merge-from
  "other - `com.google.cloud.compute.v1.CustomerEncryptionKeyProtectedDisk`

  returns: `com.google.cloud.compute.v1.CustomerEncryptionKeyProtectedDisk$Builder`"
  (^com.google.cloud.compute.v1.CustomerEncryptionKeyProtectedDisk$Builder [^CustomerEncryptionKeyProtectedDisk$Builder this ^com.google.cloud.compute.v1.CustomerEncryptionKeyProtectedDisk other]
    (-> this (.mergeFrom other))))

(defn get-disk-encryption-key
  "Decrypts data associated with the disk with a customer-supplied encryption key.

  returns: `com.google.cloud.compute.v1.CustomerEncryptionKey`"
  (^com.google.cloud.compute.v1.CustomerEncryptionKey [^CustomerEncryptionKeyProtectedDisk$Builder this]
    (-> this (.getDiskEncryptionKey))))

(defn set-disk-encryption-key
  "Decrypts data associated with the disk with a customer-supplied encryption key.

  disk-encryption-key - `com.google.cloud.compute.v1.CustomerEncryptionKey`

  returns: `com.google.cloud.compute.v1.CustomerEncryptionKeyProtectedDisk$Builder`"
  (^com.google.cloud.compute.v1.CustomerEncryptionKeyProtectedDisk$Builder [^CustomerEncryptionKeyProtectedDisk$Builder this ^com.google.cloud.compute.v1.CustomerEncryptionKey disk-encryption-key]
    (-> this (.setDiskEncryptionKey disk-encryption-key))))

(defn get-source
  "Specifies a valid partial or full URL to an existing Persistent Disk resource. This field is
   only applicable for persistent disks.

  returns: `java.lang.String`"
  (^java.lang.String [^CustomerEncryptionKeyProtectedDisk$Builder this]
    (-> this (.getSource))))

(defn set-source
  "Specifies a valid partial or full URL to an existing Persistent Disk resource. This field is
   only applicable for persistent disks.

  source - `java.lang.String`

  returns: `com.google.cloud.compute.v1.CustomerEncryptionKeyProtectedDisk$Builder`"
  (^com.google.cloud.compute.v1.CustomerEncryptionKeyProtectedDisk$Builder [^CustomerEncryptionKeyProtectedDisk$Builder this ^java.lang.String source]
    (-> this (.setSource source))))

(defn build
  "returns: `com.google.cloud.compute.v1.CustomerEncryptionKeyProtectedDisk`"
  (^com.google.cloud.compute.v1.CustomerEncryptionKeyProtectedDisk [^CustomerEncryptionKeyProtectedDisk$Builder this]
    (-> this (.build))))

(defn clone
  "returns: `com.google.cloud.compute.v1.CustomerEncryptionKeyProtectedDisk$Builder`"
  (^com.google.cloud.compute.v1.CustomerEncryptionKeyProtectedDisk$Builder [^CustomerEncryptionKeyProtectedDisk$Builder this]
    (-> this (.clone))))

