(ns com.google.cloud.storage.BucketInfo
  "Google Storage bucket metadata;"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.storage BucketInfo]))

(defn *of
  "Creates a BucketInfo object for the provided bucket name.

  name - `java.lang.String`

  returns: `com.google.cloud.storage.BucketInfo`"
  (^com.google.cloud.storage.BucketInfo [^java.lang.String name]
    (BucketInfo/of name)))

(defn *new-builder
  "Returns a BucketInfo builder where the bucket's name is set to the provided name.

  name - `java.lang.String`

  returns: `com.google.cloud.storage.BucketInfo$Builder`"
  (^com.google.cloud.storage.BucketInfo$Builder [^java.lang.String name]
    (BucketInfo/newBuilder name)))

(defn get-location-type
  "Returns the bucket's locationType.

  returns: `java.lang.String`"
  (^java.lang.String [^BucketInfo this]
    (-> this (.getLocationType))))

(defn get-not-found-page
  "Returns the custom object to return when a requested resource is not found.

  returns: `java.lang.String`"
  (^java.lang.String [^BucketInfo this]
    (-> this (.getNotFoundPage))))

(defn requester-pays
  "Returns a Boolean with either true, false, and in a specific case
   null.

   Case 1: true the field Storage.BucketField.BILLING
   is selected in a Storage.get(String, Storage.BucketGetOption...) and requester pays for
   the bucket is enabled.

   Case 2: false the field Storage.BucketField.BILLING
   in a Storage.get(String, Storage.BucketGetOption...) is selected and requester pays for
   the bucket is disable.

   Case 3: null the field Storage.BucketField.BILLING
   in a Storage.get(String, Storage.BucketGetOption...) is not selected, the value is
   unknown.

  returns: `java.lang.Boolean`"
  (^java.lang.Boolean [^BucketInfo this]
    (-> this (.requesterPays))))

(defn get-location
  "Returns the bucket's location. Data for blobs in the bucket resides in physical storage within
   this region.

  returns: `java.lang.String`"
  (^java.lang.String [^BucketInfo this]
    (-> this (.getLocation))))

(defn get-default-acl
  "Returns the default access control configuration for this bucket's blobs.

  returns: `java.util.List<com.google.cloud.storage.Acl>`"
  (^java.util.List [^BucketInfo this]
    (-> this (.getDefaultAcl))))

(defn get-create-time
  "Returns the time at which the bucket was created.

  returns: `java.lang.Long`"
  (^java.lang.Long [^BucketInfo this]
    (-> this (.getCreateTime))))

(defn get-default-kms-key-name
  "Returns the default Cloud KMS key to be applied to newly inserted objects in this bucket.

  returns: `java.lang.String`"
  (^java.lang.String [^BucketInfo this]
    (-> this (.getDefaultKmsKeyName))))

(defn get-storage-class
  "Returns the bucket's storage class. This defines how blobs in the bucket are stored and
   determines the SLA and the cost of storage.

  returns: `com.google.cloud.storage.StorageClass`"
  (^com.google.cloud.storage.StorageClass [^BucketInfo this]
    (-> this (.getStorageClass))))

(defn get-lifecycle-rules
  "returns: `java.util.List<? extends com.google.cloud.storage.BucketInfo$LifecycleRule>`"
  ([^BucketInfo this]
    (-> this (.getLifecycleRules))))

(defn get-iam-configuration
  "Returns the IAM configuration

  returns: `com.google.cloud.storage.BucketInfo$IamConfiguration`"
  (^com.google.cloud.storage.BucketInfo$IamConfiguration [^BucketInfo this]
    (-> this (.getIamConfiguration))))

(defn get-retention-effective-time
  "Returns the retention effective time a policy took effect if a retention policy is defined as a
   Long.

  returns: `java.lang.Long`"
  (^java.lang.Long [^BucketInfo this]
    (-> this (.getRetentionEffectiveTime))))

(defn get-index-page
  "Returns bucket's website index page. Behaves as the bucket's directory index where missing
   blobs are treated as potential directories.

  returns: `java.lang.String`"
  (^java.lang.String [^BucketInfo this]
    (-> this (.getIndexPage))))

(defn retention-policy-is-locked
  "Returns a Boolean with either true or null.

   Case 1: true the field Storage.BucketField.RETENTION_POLICY is selected in a Storage.get(String, Storage.BucketGetOption...) and retention policy for the bucket is locked.

   Case 2.1: null the field Storage.BucketField.RETENTION_POLICY is selected in a Storage.get(String, Storage.BucketGetOption...), but retention policy for the bucket is not
   locked. This case can be considered implicitly false.

   Case 2.2: null the field Storage.BucketField.RETENTION_POLICY is not selected in a Storage.get(String, Storage.BucketGetOption...), and the state for this field is unknown.

  returns: `java.lang.Boolean`"
  (^java.lang.Boolean [^BucketInfo this]
    (-> this (.retentionPolicyIsLocked))))

(defn get-delete-rules
  "Deprecated.

  returns: `java.util.List<? extends com.google.cloud.storage.BucketInfo$DeleteRule>`"
  ([^BucketInfo this]
    (-> this (.getDeleteRules))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^BucketInfo this]
    (-> this (.toString))))

(defn get-cors
  "Returns the bucket's Cross-Origin Resource Sharing (CORS) configuration.

  returns: `java.util.List<com.google.cloud.storage.Cors>`"
  (^java.util.List [^BucketInfo this]
    (-> this (.getCors))))

(defn get-acl
  "Returns the bucket's access control configuration.

  returns: `java.util.List<com.google.cloud.storage.Acl>`"
  (^java.util.List [^BucketInfo this]
    (-> this (.getAcl))))

(defn get-name
  "Returns the bucket's name.

  returns: `java.lang.String`"
  (^java.lang.String [^BucketInfo this]
    (-> this (.getName))))

(defn get-etag
  "Returns HTTP 1.1 Entity tag for the bucket.

  returns: `java.lang.String`"
  (^java.lang.String [^BucketInfo this]
    (-> this (.getEtag))))

(defn get-labels
  "Returns the labels for this bucket.

  returns: `java.util.Map<java.lang.String,java.lang.String>`"
  (^java.util.Map [^BucketInfo this]
    (-> this (.getLabels))))

(defn get-owner
  "Returns the bucket's owner. This is always the project team's owner group.

  returns: `com.google.cloud.storage.Acl$Entity`"
  (^com.google.cloud.storage.Acl$Entity [^BucketInfo this]
    (-> this (.getOwner))))

(defn get-metageneration
  "Returns the metadata generation of this bucket.

  returns: `java.lang.Long`"
  (^java.lang.Long [^BucketInfo this]
    (-> this (.getMetageneration))))

(defn get-self-link
  "Returns the URI of this bucket as a string.

  returns: `java.lang.String`"
  (^java.lang.String [^BucketInfo this]
    (-> this (.getSelfLink))))

(defn hash-code
  "returns: `int`"
  (^Integer [^BucketInfo this]
    (-> this (.hashCode))))

(defn versioning-enabled
  "Returns a Boolean with either true, null and in certain cases false.

   Case 1: true the field Storage.BucketField.VERSIONING is selected in a Storage.get(String, Storage.BucketGetOption...) and versions for the bucket is enabled.

   Case 2.1: null the field Storage.BucketField.VERSIONING is selected in a Storage.get(String, Storage.BucketGetOption...), but versions for the bucket is not enabled.
   This case can be considered implicitly false.

   Case 2.2: null the field Storage.BucketField.VERSIONING is not selected in a Storage.get(String, Storage.BucketGetOption...), and the state for this field is unknown.

   Case 3: false versions is explicitly set to false client side for a follow-up
   request for example Storage.update(BucketInfo, Storage.BucketTargetOption...) in which
   case the value of versions will remain false for for the given instance.

  returns: `java.lang.Boolean`"
  (^java.lang.Boolean [^BucketInfo this]
    (-> this (.versioningEnabled))))

(defn get-generated-id
  "Returns the service-generated id for the bucket.

  returns: `java.lang.String`"
  (^java.lang.String [^BucketInfo this]
    (-> this (.getGeneratedId))))

(defn get-default-event-based-hold?
  "Returns a Boolean with either true, null and in certain cases false.

   Case 1: true the field Storage.BucketField.DEFAULT_EVENT_BASED_HOLD is selected in a Storage.get(String, Storage.BucketGetOption...) and default event-based hold for the bucket is
   enabled.

   Case 2.1: null the field Storage.BucketField.DEFAULT_EVENT_BASED_HOLD is selected in a Storage.get(String, Storage.BucketGetOption...), but default event-based hold for the bucket
   is not enabled. This case can be considered implicitly false.

   Case 2.2: null the field Storage.BucketField.DEFAULT_EVENT_BASED_HOLD is not selected in a
   Storage.get(String, Storage.BucketGetOption...), and the state for this field is
   unknown.

   Case 3: false default event-based hold is explicitly set to false using in a Builder#setDefaultEventBasedHold(Boolean) client side for a follow-up request e.g. Storage.update(BucketInfo, Storage.BucketTargetOption...) in which case the value of default
   event-based hold will remain false for the given instance.

  returns: `java.lang.Boolean`"
  (^java.lang.Boolean [^BucketInfo this]
    (-> this (.getDefaultEventBasedHold))))

(defn get-retention-period
  "Returns the retention policy retention period.

  returns: `java.lang.Long`"
  (^java.lang.Long [^BucketInfo this]
    (-> this (.getRetentionPeriod))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^BucketInfo this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn to-builder
  "Returns a builder for the current bucket.

  returns: `com.google.cloud.storage.BucketInfo$Builder`"
  (^com.google.cloud.storage.BucketInfo$Builder [^BucketInfo this]
    (-> this (.toBuilder))))

