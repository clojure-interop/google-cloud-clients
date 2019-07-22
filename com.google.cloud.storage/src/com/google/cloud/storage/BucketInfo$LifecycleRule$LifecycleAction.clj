(ns com.google.cloud.storage.BucketInfo$LifecycleRule$LifecycleAction
  "Base class for the Action to take when a Lifecycle Condition is met. Specific Actions are
  expressed as subclasses of this class, accessed by static factory methods."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.storage BucketInfo$LifecycleRule$LifecycleAction]))

(defn ->lifecycle-action
  "Constructor."
  (^BucketInfo$LifecycleRule$LifecycleAction []
    (new BucketInfo$LifecycleRule$LifecycleAction )))

(defn *new-delete-action
  "Creates a new DeleteLifecycleAction. Blobs that meet the Condition associated with
   this action will be deleted.

  returns: `com.google.cloud.storage.BucketInfo$LifecycleRule$DeleteLifecycleAction`"
  (^com.google.cloud.storage.BucketInfo$LifecycleRule$DeleteLifecycleAction []
    (BucketInfo$LifecycleRule$LifecycleAction/newDeleteAction )))

(defn *new-set-storage-class-action
  "Creates a new SetStorageClassLifecycleAction. A Blob's storage class that meets the
   action's conditions will be changed to the specified storage class.

  storage-class - The new storage class to use when conditions are met for this action. - `com.google.cloud.storage.StorageClass`

  returns: `com.google.cloud.storage.BucketInfo$LifecycleRule$SetStorageClassLifecycleAction`"
  (^com.google.cloud.storage.BucketInfo$LifecycleRule$SetStorageClassLifecycleAction [^com.google.cloud.storage.StorageClass storage-class]
    (BucketInfo$LifecycleRule$LifecycleAction/newSetStorageClassAction storage-class)))

(defn get-action-type
  "returns: `java.lang.String`"
  (^java.lang.String [^BucketInfo$LifecycleRule$LifecycleAction this]
    (-> this (.getActionType))))

