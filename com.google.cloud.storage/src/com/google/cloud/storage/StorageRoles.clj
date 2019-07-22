(ns com.google.cloud.storage.StorageRoles
  "IAM roles specific to Storage. An overview of the permissions available to Storage and the
  capabilities they grant can be found in the Google Cloud Storage IAM
  documentation."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.storage StorageRoles]))

(defn *object-viewer
  "Grants the following permissions:


     storage.objects.list
     storage.objects.get

  returns: `com.google.cloud.Role`"
  (^com.google.cloud.Role []
    (StorageRoles/objectViewer )))

(defn *legacy-bucket-reader
  "Grants the following permissions:


     storage.buckets.get
     storage.objects.list

  returns: `com.google.cloud.Role`"
  (^com.google.cloud.Role []
    (StorageRoles/legacyBucketReader )))

(defn *object-admin
  "Grants the following permissions:


     storage.objects.*

  returns: `com.google.cloud.Role`"
  (^com.google.cloud.Role []
    (StorageRoles/objectAdmin )))

(defn *object-creator
  "Grants the following permissions:


     storage.objects.create

  returns: `com.google.cloud.Role`"
  (^com.google.cloud.Role []
    (StorageRoles/objectCreator )))

(defn *legacy-bucket-writer
  "Grants the following permissions:


     storage.buckets.get
     storage.objects.list
     storage.objects.create
     storage.objects.delete

  returns: `com.google.cloud.Role`"
  (^com.google.cloud.Role []
    (StorageRoles/legacyBucketWriter )))

(defn *admin
  "Grants the following permissions:


     storage.buckets.*
     storage.objects.*

  returns: `com.google.cloud.Role`"
  (^com.google.cloud.Role []
    (StorageRoles/admin )))

(defn *legacy-object-owner
  "Grants the following permissions:


     storage.objects.get
     storage.objects.update
     storage.objects.getIamPolicy
     storage.objects.setIamPolicy

  returns: `com.google.cloud.Role`"
  (^com.google.cloud.Role []
    (StorageRoles/legacyObjectOwner )))

(defn *legacy-bucket-owner
  "Grants the following permissions:


     storage.buckets.get
     storage.buckets.update
     storage.buckets.setIamPolicy
     storage.buckets.getIamPolicy
     storage.objects.list
     storage.objects.create
     storage.objects.delete

  returns: `com.google.cloud.Role`"
  (^com.google.cloud.Role []
    (StorageRoles/legacyBucketOwner )))

(defn *legacy-object-reader
  "Grants the following permissions:


     storage.objects.get

  returns: `com.google.cloud.Role`"
  (^com.google.cloud.Role []
    (StorageRoles/legacyObjectReader )))

