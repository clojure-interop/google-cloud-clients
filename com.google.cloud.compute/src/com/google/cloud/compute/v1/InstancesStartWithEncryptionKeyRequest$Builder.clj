(ns com.google.cloud.compute.v1.InstancesStartWithEncryptionKeyRequest$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 InstancesStartWithEncryptionKeyRequest$Builder]))

(defn merge-from
  "other - `com.google.cloud.compute.v1.InstancesStartWithEncryptionKeyRequest`

  returns: `com.google.cloud.compute.v1.InstancesStartWithEncryptionKeyRequest$Builder`"
  (^com.google.cloud.compute.v1.InstancesStartWithEncryptionKeyRequest$Builder [^InstancesStartWithEncryptionKeyRequest$Builder this ^com.google.cloud.compute.v1.InstancesStartWithEncryptionKeyRequest other]
    (-> this (.mergeFrom other))))

(defn get-disks-list
  "Array of disks associated with this instance that are protected with a customer-supplied
   encryption key.

   In order to start the instance, the disk url and its corresponding key must be provided.

   If the disk is not protected with a customer-supplied encryption key it should not be
   specified.

  returns: `java.util.List<com.google.cloud.compute.v1.CustomerEncryptionKeyProtectedDisk>`"
  (^java.util.List [^InstancesStartWithEncryptionKeyRequest$Builder this]
    (-> this (.getDisksList))))

(defn add-all-disks
  "Array of disks associated with this instance that are protected with a customer-supplied
   encryption key.

   In order to start the instance, the disk url and its corresponding key must be provided.

   If the disk is not protected with a customer-supplied encryption key it should not be
   specified.

  disks - `java.util.List`

  returns: `com.google.cloud.compute.v1.InstancesStartWithEncryptionKeyRequest$Builder`"
  (^com.google.cloud.compute.v1.InstancesStartWithEncryptionKeyRequest$Builder [^InstancesStartWithEncryptionKeyRequest$Builder this ^java.util.List disks]
    (-> this (.addAllDisks disks))))

(defn add-disks
  "Array of disks associated with this instance that are protected with a customer-supplied
   encryption key.

   In order to start the instance, the disk url and its corresponding key must be provided.

   If the disk is not protected with a customer-supplied encryption key it should not be
   specified.

  disks - `com.google.cloud.compute.v1.CustomerEncryptionKeyProtectedDisk`

  returns: `com.google.cloud.compute.v1.InstancesStartWithEncryptionKeyRequest$Builder`"
  (^com.google.cloud.compute.v1.InstancesStartWithEncryptionKeyRequest$Builder [^InstancesStartWithEncryptionKeyRequest$Builder this ^com.google.cloud.compute.v1.CustomerEncryptionKeyProtectedDisk disks]
    (-> this (.addDisks disks))))

(defn build
  "returns: `com.google.cloud.compute.v1.InstancesStartWithEncryptionKeyRequest`"
  (^com.google.cloud.compute.v1.InstancesStartWithEncryptionKeyRequest [^InstancesStartWithEncryptionKeyRequest$Builder this]
    (-> this (.build))))

(defn clone
  "returns: `com.google.cloud.compute.v1.InstancesStartWithEncryptionKeyRequest$Builder`"
  (^com.google.cloud.compute.v1.InstancesStartWithEncryptionKeyRequest$Builder [^InstancesStartWithEncryptionKeyRequest$Builder this]
    (-> this (.clone))))

