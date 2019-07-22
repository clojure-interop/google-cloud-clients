(ns com.google.cloud.storage.BucketInfo$LifecycleRule$DeleteLifecycleAction
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.storage BucketInfo$LifecycleRule$DeleteLifecycleAction]))

(def *-type
  "Static Constant.

  type: java.lang.String"
  BucketInfo$LifecycleRule$DeleteLifecycleAction/TYPE)

(defn get-action-type
  "returns: `java.lang.String`"
  (^java.lang.String [^BucketInfo$LifecycleRule$DeleteLifecycleAction this]
    (-> this (.getActionType))))

