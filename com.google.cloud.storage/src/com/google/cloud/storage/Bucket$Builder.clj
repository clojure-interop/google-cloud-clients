(ns com.google.cloud.storage.Bucket$Builder
  "Builder for Bucket."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.storage Bucket$Builder]))

(defn set-labels
  "Description copied from class: BucketInfo.Builder

  labels - `java.util.Map`

  returns: `com.google.cloud.storage.Bucket$Builder`"
  (^com.google.cloud.storage.Bucket$Builder [^Bucket$Builder this ^java.util.Map labels]
    (-> this (.setLabels labels))))

(defn set-iam-configuration
  "Description copied from class: BucketInfo.Builder

  iam-configuration - `com.google.cloud.storage.BucketInfo$IamConfiguration`

  returns: `com.google.cloud.storage.Bucket$Builder`"
  (^com.google.cloud.storage.Bucket$Builder [^Bucket$Builder this ^com.google.cloud.storage.BucketInfo$IamConfiguration iam-configuration]
    (-> this (.setIamConfiguration iam-configuration))))

(defn set-location
  "Description copied from class: BucketInfo.Builder

  location - `java.lang.String`

  returns: `com.google.cloud.storage.Bucket$Builder`"
  (^com.google.cloud.storage.Bucket$Builder [^Bucket$Builder this ^java.lang.String location]
    (-> this (.setLocation location))))

(defn set-default-acl
  "Description copied from class: BucketInfo.Builder

  acl - `java.lang.Iterable`

  returns: `com.google.cloud.storage.Bucket$Builder`"
  (^com.google.cloud.storage.Bucket$Builder [^Bucket$Builder this ^java.lang.Iterable acl]
    (-> this (.setDefaultAcl acl))))

(defn set-name
  "Description copied from class: BucketInfo.Builder

  name - `java.lang.String`

  returns: `com.google.cloud.storage.Bucket$Builder`"
  (^com.google.cloud.storage.Bucket$Builder [^Bucket$Builder this ^java.lang.String name]
    (-> this (.setName name))))

(defn set-lifecycle-rules
  "Description copied from class: BucketInfo.Builder

  rules - `java.lang.Iterable`

  returns: `com.google.cloud.storage.Bucket$Builder`"
  (^com.google.cloud.storage.Bucket$Builder [^Bucket$Builder this ^java.lang.Iterable rules]
    (-> this (.setLifecycleRules rules))))

(defn set-storage-class
  "Description copied from class: BucketInfo.Builder

  storage-class - `com.google.cloud.storage.StorageClass`

  returns: `com.google.cloud.storage.Bucket$Builder`"
  (^com.google.cloud.storage.Bucket$Builder [^Bucket$Builder this ^com.google.cloud.storage.StorageClass storage-class]
    (-> this (.setStorageClass storage-class))))

(defn set-default-event-based-hold
  "Description copied from class: BucketInfo.Builder

  default-event-based-hold - `java.lang.Boolean`

  returns: `com.google.cloud.storage.Bucket$Builder`"
  (^com.google.cloud.storage.Bucket$Builder [^Bucket$Builder this ^java.lang.Boolean default-event-based-hold]
    (-> this (.setDefaultEventBasedHold default-event-based-hold))))

(defn set-index-page
  "Description copied from class: BucketInfo.Builder

  index-page - `java.lang.String`

  returns: `com.google.cloud.storage.Bucket$Builder`"
  (^com.google.cloud.storage.Bucket$Builder [^Bucket$Builder this ^java.lang.String index-page]
    (-> this (.setIndexPage index-page))))

(defn set-not-found-page
  "Description copied from class: BucketInfo.Builder

  not-found-page - `java.lang.String`

  returns: `com.google.cloud.storage.Bucket$Builder`"
  (^com.google.cloud.storage.Bucket$Builder [^Bucket$Builder this ^java.lang.String not-found-page]
    (-> this (.setNotFoundPage not-found-page))))

(defn set-acl
  "Description copied from class: BucketInfo.Builder

  acl - `java.lang.Iterable`

  returns: `com.google.cloud.storage.Bucket$Builder`"
  (^com.google.cloud.storage.Bucket$Builder [^Bucket$Builder this ^java.lang.Iterable acl]
    (-> this (.setAcl acl))))

(defn build
  "Description copied from class: BucketInfo.Builder

  returns: `com.google.cloud.storage.Bucket`"
  (^com.google.cloud.storage.Bucket [^Bucket$Builder this]
    (-> this (.build))))

(defn set-requester-pays
  "Description copied from class: BucketInfo.Builder

  requester-pays - `java.lang.Boolean`

  returns: `com.google.cloud.storage.Bucket$Builder`"
  (^com.google.cloud.storage.Bucket$Builder [^Bucket$Builder this ^java.lang.Boolean requester-pays]
    (-> this (.setRequesterPays requester-pays))))

(defn set-versioning-enabled
  "Description copied from class: BucketInfo.Builder

  enable - `java.lang.Boolean`

  returns: `com.google.cloud.storage.Bucket$Builder`"
  (^com.google.cloud.storage.Bucket$Builder [^Bucket$Builder this ^java.lang.Boolean enable]
    (-> this (.setVersioningEnabled enable))))

(defn set-delete-rules
  "Deprecated.

  rules - `java.lang.Iterable`

  returns: `com.google.cloud.storage.Bucket$Builder`"
  (^com.google.cloud.storage.Bucket$Builder [^Bucket$Builder this ^java.lang.Iterable rules]
    (-> this (.setDeleteRules rules))))

(defn set-retention-period
  "Description copied from class: BucketInfo.Builder

  retention-period - `java.lang.Long`

  returns: `com.google.cloud.storage.Bucket$Builder`"
  (^com.google.cloud.storage.Bucket$Builder [^Bucket$Builder this ^java.lang.Long retention-period]
    (-> this (.setRetentionPeriod retention-period))))

(defn set-default-kms-key-name
  "Description copied from class: BucketInfo.Builder

  default-kms-key-name - `java.lang.String`

  returns: `com.google.cloud.storage.Bucket$Builder`"
  (^com.google.cloud.storage.Bucket$Builder [^Bucket$Builder this ^java.lang.String default-kms-key-name]
    (-> this (.setDefaultKmsKeyName default-kms-key-name))))

(defn set-cors
  "Description copied from class: BucketInfo.Builder

  cors - `java.lang.Iterable`

  returns: `com.google.cloud.storage.Bucket$Builder`"
  (^com.google.cloud.storage.Bucket$Builder [^Bucket$Builder this ^java.lang.Iterable cors]
    (-> this (.setCors cors))))

