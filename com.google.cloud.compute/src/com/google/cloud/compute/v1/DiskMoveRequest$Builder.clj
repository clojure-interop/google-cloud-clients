(ns com.google.cloud.compute.v1.DiskMoveRequest$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 DiskMoveRequest$Builder]))

(defn merge-from
  "other - `com.google.cloud.compute.v1.DiskMoveRequest`

  returns: `com.google.cloud.compute.v1.DiskMoveRequest$Builder`"
  (^com.google.cloud.compute.v1.DiskMoveRequest$Builder [^DiskMoveRequest$Builder this ^com.google.cloud.compute.v1.DiskMoveRequest other]
    (-> this (.mergeFrom other))))

(defn get-destination-zone
  "The URL of the destination zone to move the disk. This can be a full or partial URL. For
   example, the following are all valid URLs to a zone: -
   https://www.googleapis.com/compute/v1/projects/project/zones/zone -
   projects/project/zones/zone - zones/zone

  returns: `java.lang.String`"
  (^java.lang.String [^DiskMoveRequest$Builder this]
    (-> this (.getDestinationZone))))

(defn set-destination-zone
  "The URL of the destination zone to move the disk. This can be a full or partial URL. For
   example, the following are all valid URLs to a zone: -
   https://www.googleapis.com/compute/v1/projects/project/zones/zone -
   projects/project/zones/zone - zones/zone

  destination-zone - `java.lang.String`

  returns: `com.google.cloud.compute.v1.DiskMoveRequest$Builder`"
  (^com.google.cloud.compute.v1.DiskMoveRequest$Builder [^DiskMoveRequest$Builder this ^java.lang.String destination-zone]
    (-> this (.setDestinationZone destination-zone))))

(defn get-target-disk
  "The URL of the target disk to move. This can be a full or partial URL. For example, the
   following are all valid URLs to a disk: -
   https://www.googleapis.com/compute/v1/projects/project/zones/zone/disks/disk -
   projects/project/zones/zone/disks/disk - zones/zone/disks/disk

  returns: `java.lang.String`"
  (^java.lang.String [^DiskMoveRequest$Builder this]
    (-> this (.getTargetDisk))))

(defn set-target-disk
  "The URL of the target disk to move. This can be a full or partial URL. For example, the
   following are all valid URLs to a disk: -
   https://www.googleapis.com/compute/v1/projects/project/zones/zone/disks/disk -
   projects/project/zones/zone/disks/disk - zones/zone/disks/disk

  target-disk - `java.lang.String`

  returns: `com.google.cloud.compute.v1.DiskMoveRequest$Builder`"
  (^com.google.cloud.compute.v1.DiskMoveRequest$Builder [^DiskMoveRequest$Builder this ^java.lang.String target-disk]
    (-> this (.setTargetDisk target-disk))))

(defn build
  "returns: `com.google.cloud.compute.v1.DiskMoveRequest`"
  (^com.google.cloud.compute.v1.DiskMoveRequest [^DiskMoveRequest$Builder this]
    (-> this (.build))))

(defn clone
  "returns: `com.google.cloud.compute.v1.DiskMoveRequest$Builder`"
  (^com.google.cloud.compute.v1.DiskMoveRequest$Builder [^DiskMoveRequest$Builder this]
    (-> this (.clone))))

