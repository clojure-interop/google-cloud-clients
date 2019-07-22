(ns com.google.cloud.storage.BucketInfo$Builder
  "Builder for BucketInfo."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.storage BucketInfo$Builder]))

(defn set-labels
  "Sets the label of this bucket.

  labels - `java.util.Map`

  returns: `com.google.cloud.storage.BucketInfo$Builder`"
  (^com.google.cloud.storage.BucketInfo$Builder [^BucketInfo$Builder this ^java.util.Map labels]
    (-> this (.setLabels labels))))

(defn set-iam-configuration
  "Sets the IamConfiguration to specify whether IAM access should be enabled.

  iam-configuration - `com.google.cloud.storage.BucketInfo$IamConfiguration`

  returns: `com.google.cloud.storage.BucketInfo$Builder`"
  (^com.google.cloud.storage.BucketInfo$Builder [^BucketInfo$Builder this ^com.google.cloud.storage.BucketInfo$IamConfiguration iam-configuration]
    (-> this (.setIamConfiguration iam-configuration))))

(defn set-location
  "Sets the bucket's location. Data for blobs in the bucket resides in physical storage within
   this region. A list of supported values is available here.

  location - `java.lang.String`

  returns: `com.google.cloud.storage.BucketInfo$Builder`"
  (^com.google.cloud.storage.BucketInfo$Builder [^BucketInfo$Builder this ^java.lang.String location]
    (-> this (.setLocation location))))

(defn set-default-acl
  "Sets the default access control configuration to apply to bucket's blobs when no other
   configuration is specified.

  acl - `java.lang.Iterable`

  returns: `com.google.cloud.storage.BucketInfo$Builder`"
  (^com.google.cloud.storage.BucketInfo$Builder [^BucketInfo$Builder this ^java.lang.Iterable acl]
    (-> this (.setDefaultAcl acl))))

(defn set-name
  "Sets the bucket's name.

  name - `java.lang.String`

  returns: `com.google.cloud.storage.BucketInfo$Builder`"
  (^com.google.cloud.storage.BucketInfo$Builder [^BucketInfo$Builder this ^java.lang.String name]
    (-> this (.setName name))))

(defn set-lifecycle-rules
  "Sets the bucket's lifecycle configuration as a number of lifecycle rules, consisting of an
   action and a condition.

  rules - `java.lang.Iterable`

  returns: `com.google.cloud.storage.BucketInfo$Builder`"
  (^com.google.cloud.storage.BucketInfo$Builder [^BucketInfo$Builder this ^java.lang.Iterable rules]
    (-> this (.setLifecycleRules rules))))

(defn set-storage-class
  "Sets the bucket's storage class. This defines how blobs in the bucket are stored and
   determines the SLA and the cost of storage. A list of supported values is available here.

  storage-class - `com.google.cloud.storage.StorageClass`

  returns: `com.google.cloud.storage.BucketInfo$Builder`"
  (^com.google.cloud.storage.BucketInfo$Builder [^BucketInfo$Builder this ^com.google.cloud.storage.StorageClass storage-class]
    (-> this (.setStorageClass storage-class))))

(defn set-default-event-based-hold
  "Sets the default event-based hold for this bucket.

  default-event-based-hold - `java.lang.Boolean`

  returns: `com.google.cloud.storage.BucketInfo$Builder`"
  (^com.google.cloud.storage.BucketInfo$Builder [^BucketInfo$Builder this ^java.lang.Boolean default-event-based-hold]
    (-> this (.setDefaultEventBasedHold default-event-based-hold))))

(defn set-index-page
  "Sets the bucket's website index page. Behaves as the bucket's directory index where missing
   blobs are treated as potential directories.

  index-page - `java.lang.String`

  returns: `com.google.cloud.storage.BucketInfo$Builder`"
  (^com.google.cloud.storage.BucketInfo$Builder [^BucketInfo$Builder this ^java.lang.String index-page]
    (-> this (.setIndexPage index-page))))

(defn set-not-found-page
  "Sets the custom object to return when a requested resource is not found.

  not-found-page - `java.lang.String`

  returns: `com.google.cloud.storage.BucketInfo$Builder`"
  (^com.google.cloud.storage.BucketInfo$Builder [^BucketInfo$Builder this ^java.lang.String not-found-page]
    (-> this (.setNotFoundPage not-found-page))))

(defn set-acl
  "Sets the bucket's access control configuration.

  acl - `java.lang.Iterable`

  returns: `com.google.cloud.storage.BucketInfo$Builder`"
  (^com.google.cloud.storage.BucketInfo$Builder [^BucketInfo$Builder this ^java.lang.Iterable acl]
    (-> this (.setAcl acl))))

(defn build
  "Creates a BucketInfo object.

  returns: `com.google.cloud.storage.BucketInfo`"
  (^com.google.cloud.storage.BucketInfo [^BucketInfo$Builder this]
    (-> this (.build))))

(defn set-requester-pays
  "Sets whether a user accessing the bucket or an object it contains should assume the transit
   costs related to the access.

  requester-pays - `java.lang.Boolean`

  returns: `com.google.cloud.storage.BucketInfo$Builder`"
  (^com.google.cloud.storage.BucketInfo$Builder [^BucketInfo$Builder this ^java.lang.Boolean requester-pays]
    (-> this (.setRequesterPays requester-pays))))

(defn set-versioning-enabled
  "Sets whether versioning should be enabled for this bucket. When set to true, versioning is
   fully enabled.

  enable - `java.lang.Boolean`

  returns: `com.google.cloud.storage.BucketInfo$Builder`"
  (^com.google.cloud.storage.BucketInfo$Builder [^BucketInfo$Builder this ^java.lang.Boolean enable]
    (-> this (.setVersioningEnabled enable))))

(defn set-delete-rules
  "Deprecated. Use setLifecycleRules instead, as in setLifecycleRules(Collections.singletonList( new BucketInfo.LifecycleRule(
       LifecycleAction.newDeleteAction(), LifecycleCondition.newBuilder().setAge(5).build())));

  rules - `java.lang.Iterable`

  returns: `com.google.cloud.storage.BucketInfo$Builder`"
  (^com.google.cloud.storage.BucketInfo$Builder [^BucketInfo$Builder this ^java.lang.Iterable rules]
    (-> this (.setDeleteRules rules))))

(defn set-retention-period
  "If policy is not locked this value can be cleared, increased, and decreased. If policy is
   locked the retention period can only be increased.

  retention-period - `java.lang.Long`

  returns: `com.google.cloud.storage.BucketInfo$Builder`"
  (^com.google.cloud.storage.BucketInfo$Builder [^BucketInfo$Builder this ^java.lang.Long retention-period]
    (-> this (.setRetentionPeriod retention-period))))

(defn set-default-kms-key-name
  "Sets the default Cloud KMS key name for this bucket.

  default-kms-key-name - `java.lang.String`

  returns: `com.google.cloud.storage.BucketInfo$Builder`"
  (^com.google.cloud.storage.BucketInfo$Builder [^BucketInfo$Builder this ^java.lang.String default-kms-key-name]
    (-> this (.setDefaultKmsKeyName default-kms-key-name))))

(defn set-cors
  "Sets the bucket's Cross-Origin Resource Sharing (CORS) configuration.

  cors - `java.lang.Iterable`

  returns: `com.google.cloud.storage.BucketInfo$Builder`"
  (^com.google.cloud.storage.BucketInfo$Builder [^BucketInfo$Builder this ^java.lang.Iterable cors]
    (-> this (.setCors cors))))

