(ns com.google.cloud.compute.v1.InstanceGroupManagerUpdatePolicy$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 InstanceGroupManagerUpdatePolicy$Builder]))

(defn set-minimal-action
  "Minimal action to be taken on an instance. You can specify either RESTART to restart existing
   instances or REPLACE to delete and create new instances from the target template. If you
   specify a RESTART, the Updater will attempt to perform that action only. However, if the
   Updater determines that the minimal action you specify is not enough to perform the update,
   it might perform a more disruptive action.

  minimal-action - `java.lang.String`

  returns: `com.google.cloud.compute.v1.InstanceGroupManagerUpdatePolicy$Builder`"
  (^com.google.cloud.compute.v1.InstanceGroupManagerUpdatePolicy$Builder [^InstanceGroupManagerUpdatePolicy$Builder this ^java.lang.String minimal-action]
    (-> this (.setMinimalAction minimal-action))))

(defn get-type
  "returns: `java.lang.String`"
  (^java.lang.String [^InstanceGroupManagerUpdatePolicy$Builder this]
    (-> this (.getType))))

(defn get-max-surge
  "The maximum number of instances that can be created above the specified targetSize during the
   update process. By default, a fixed value of 1 is used. This value can be either a fixed
   number or a percentage if the instance group has 10 or more instances. If you set a
   percentage, the number of instances will be rounded up if necessary.

   At least one of either maxSurge or maxUnavailable must be greater than 0. Learn more about
   maxSurge.

  returns: `com.google.cloud.compute.v1.FixedOrPercent`"
  (^com.google.cloud.compute.v1.FixedOrPercent [^InstanceGroupManagerUpdatePolicy$Builder this]
    (-> this (.getMaxSurge))))

(defn set-type
  "type - `java.lang.String`

  returns: `com.google.cloud.compute.v1.InstanceGroupManagerUpdatePolicy$Builder`"
  (^com.google.cloud.compute.v1.InstanceGroupManagerUpdatePolicy$Builder [^InstanceGroupManagerUpdatePolicy$Builder this ^java.lang.String type]
    (-> this (.setType type))))

(defn get-max-unavailable
  "The maximum number of instances that can be unavailable during the update process. An
   instance is considered available if all of the following conditions are satisfied:

   - The instance's status is RUNNING. - If there is a health check on the instance group,
   the instance's liveness health check result must be HEALTHY at least once. If there is no
   health check on the group, then the instance only needs to have a status of RUNNING to be
   considered available. By default, a fixed value of 1 is used. This value can be either a
   fixed number or a percentage if the instance group has 10 or more instances. If you set a
   percentage, the number of instances will be rounded up if necessary.

   At least one of either maxSurge or maxUnavailable must be greater than 0. Learn more about
   maxUnavailable.

  returns: `com.google.cloud.compute.v1.FixedOrPercent`"
  (^com.google.cloud.compute.v1.FixedOrPercent [^InstanceGroupManagerUpdatePolicy$Builder this]
    (-> this (.getMaxUnavailable))))

(defn get-minimal-action
  "Minimal action to be taken on an instance. You can specify either RESTART to restart existing
   instances or REPLACE to delete and create new instances from the target template. If you
   specify a RESTART, the Updater will attempt to perform that action only. However, if the
   Updater determines that the minimal action you specify is not enough to perform the update,
   it might perform a more disruptive action.

  returns: `java.lang.String`"
  (^java.lang.String [^InstanceGroupManagerUpdatePolicy$Builder this]
    (-> this (.getMinimalAction))))

(defn set-max-unavailable
  "The maximum number of instances that can be unavailable during the update process. An
   instance is considered available if all of the following conditions are satisfied:

   - The instance's status is RUNNING. - If there is a health check on the instance group,
   the instance's liveness health check result must be HEALTHY at least once. If there is no
   health check on the group, then the instance only needs to have a status of RUNNING to be
   considered available. By default, a fixed value of 1 is used. This value can be either a
   fixed number or a percentage if the instance group has 10 or more instances. If you set a
   percentage, the number of instances will be rounded up if necessary.

   At least one of either maxSurge or maxUnavailable must be greater than 0. Learn more about
   maxUnavailable.

  max-unavailable - `com.google.cloud.compute.v1.FixedOrPercent`

  returns: `com.google.cloud.compute.v1.InstanceGroupManagerUpdatePolicy$Builder`"
  (^com.google.cloud.compute.v1.InstanceGroupManagerUpdatePolicy$Builder [^InstanceGroupManagerUpdatePolicy$Builder this ^com.google.cloud.compute.v1.FixedOrPercent max-unavailable]
    (-> this (.setMaxUnavailable max-unavailable))))

(defn build
  "returns: `com.google.cloud.compute.v1.InstanceGroupManagerUpdatePolicy`"
  (^com.google.cloud.compute.v1.InstanceGroupManagerUpdatePolicy [^InstanceGroupManagerUpdatePolicy$Builder this]
    (-> this (.build))))

(defn merge-from
  "other - `com.google.cloud.compute.v1.InstanceGroupManagerUpdatePolicy`

  returns: `com.google.cloud.compute.v1.InstanceGroupManagerUpdatePolicy$Builder`"
  (^com.google.cloud.compute.v1.InstanceGroupManagerUpdatePolicy$Builder [^InstanceGroupManagerUpdatePolicy$Builder this ^com.google.cloud.compute.v1.InstanceGroupManagerUpdatePolicy other]
    (-> this (.mergeFrom other))))

(defn clone
  "returns: `com.google.cloud.compute.v1.InstanceGroupManagerUpdatePolicy$Builder`"
  (^com.google.cloud.compute.v1.InstanceGroupManagerUpdatePolicy$Builder [^InstanceGroupManagerUpdatePolicy$Builder this]
    (-> this (.clone))))

(defn set-max-surge
  "The maximum number of instances that can be created above the specified targetSize during the
   update process. By default, a fixed value of 1 is used. This value can be either a fixed
   number or a percentage if the instance group has 10 or more instances. If you set a
   percentage, the number of instances will be rounded up if necessary.

   At least one of either maxSurge or maxUnavailable must be greater than 0. Learn more about
   maxSurge.

  max-surge - `com.google.cloud.compute.v1.FixedOrPercent`

  returns: `com.google.cloud.compute.v1.InstanceGroupManagerUpdatePolicy$Builder`"
  (^com.google.cloud.compute.v1.InstanceGroupManagerUpdatePolicy$Builder [^InstanceGroupManagerUpdatePolicy$Builder this ^com.google.cloud.compute.v1.FixedOrPercent max-surge]
    (-> this (.setMaxSurge max-surge))))

