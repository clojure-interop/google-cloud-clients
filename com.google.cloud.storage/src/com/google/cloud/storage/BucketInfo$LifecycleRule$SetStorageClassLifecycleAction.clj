(ns com.google.cloud.storage.BucketInfo$LifecycleRule$SetStorageClassLifecycleAction
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.storage BucketInfo$LifecycleRule$SetStorageClassLifecycleAction]))

(def *-type
  "Static Constant.

  type: java.lang.String"
  BucketInfo$LifecycleRule$SetStorageClassLifecycleAction/TYPE)

(defn get-action-type
  "returns: `java.lang.String`"
  (^java.lang.String [^BucketInfo$LifecycleRule$SetStorageClassLifecycleAction this]
    (-> this (.getActionType))))

