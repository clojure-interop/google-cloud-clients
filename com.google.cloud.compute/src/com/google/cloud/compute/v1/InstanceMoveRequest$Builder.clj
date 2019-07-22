(ns com.google.cloud.compute.v1.InstanceMoveRequest$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 InstanceMoveRequest$Builder]))

(defn merge-from
  "other - `com.google.cloud.compute.v1.InstanceMoveRequest`

  returns: `com.google.cloud.compute.v1.InstanceMoveRequest$Builder`"
  (^com.google.cloud.compute.v1.InstanceMoveRequest$Builder [^InstanceMoveRequest$Builder this ^com.google.cloud.compute.v1.InstanceMoveRequest other]
    (-> this (.mergeFrom other))))

(defn get-destination-zone
  "The URL of the destination zone to move the instance. This can be a full or partial URL. For
   example, the following are all valid URLs to a zone: -
   https://www.googleapis.com/compute/v1/projects/project/zones/zone -
   projects/project/zones/zone - zones/zone

  returns: `java.lang.String`"
  (^java.lang.String [^InstanceMoveRequest$Builder this]
    (-> this (.getDestinationZone))))

(defn set-destination-zone
  "The URL of the destination zone to move the instance. This can be a full or partial URL. For
   example, the following are all valid URLs to a zone: -
   https://www.googleapis.com/compute/v1/projects/project/zones/zone -
   projects/project/zones/zone - zones/zone

  destination-zone - `java.lang.String`

  returns: `com.google.cloud.compute.v1.InstanceMoveRequest$Builder`"
  (^com.google.cloud.compute.v1.InstanceMoveRequest$Builder [^InstanceMoveRequest$Builder this ^java.lang.String destination-zone]
    (-> this (.setDestinationZone destination-zone))))

(defn get-target-instance
  "The URL of the target instance to move. This can be a full or partial URL. For example, the
   following are all valid URLs to an instance: -
   https://www.googleapis.com/compute/v1/projects/project/zones/zone/instances/instance -
   projects/project/zones/zone/instances/instance - zones/zone/instances/instance

  returns: `java.lang.String`"
  (^java.lang.String [^InstanceMoveRequest$Builder this]
    (-> this (.getTargetInstance))))

(defn set-target-instance
  "The URL of the target instance to move. This can be a full or partial URL. For example, the
   following are all valid URLs to an instance: -
   https://www.googleapis.com/compute/v1/projects/project/zones/zone/instances/instance -
   projects/project/zones/zone/instances/instance - zones/zone/instances/instance

  target-instance - `java.lang.String`

  returns: `com.google.cloud.compute.v1.InstanceMoveRequest$Builder`"
  (^com.google.cloud.compute.v1.InstanceMoveRequest$Builder [^InstanceMoveRequest$Builder this ^java.lang.String target-instance]
    (-> this (.setTargetInstance target-instance))))

(defn build
  "returns: `com.google.cloud.compute.v1.InstanceMoveRequest`"
  (^com.google.cloud.compute.v1.InstanceMoveRequest [^InstanceMoveRequest$Builder this]
    (-> this (.build))))

(defn clone
  "returns: `com.google.cloud.compute.v1.InstanceMoveRequest$Builder`"
  (^com.google.cloud.compute.v1.InstanceMoveRequest$Builder [^InstanceMoveRequest$Builder this]
    (-> this (.clone))))

