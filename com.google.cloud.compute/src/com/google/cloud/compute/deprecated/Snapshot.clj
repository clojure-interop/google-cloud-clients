(ns com.google.cloud.compute.deprecated.Snapshot
  "A Google Compute Engine snapshot. Compute Engine allows you to take snapshots of your persistent
  disk and create new persistent disks from that snapshot. This can be useful for backing up data,
  recreating a persistent disk that might have been lost, or copying a persistent disk. Snapshots
  can be applied across persistent disk types. Snapshot adds a layer of service-related
  functionality over SnapshotInfo. Objects of this class are immutable; to get a Snapshot object with the most recent information use reload(com.google.cloud.compute.deprecated.Compute.SnapshotOption...)."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated Snapshot]))

(defn exists?
  "Checks if this snapshot exists.

  returns: true if this snapshot exists, false otherwise - `boolean`

  throws: com.google.cloud.compute.deprecated.ComputeException - upon failure"
  (^Boolean [^Snapshot this]
    (-> this (.exists))))

(defn reload
  "Fetches current snapshot's latest information. Returns null if the snapshot does not
   exist.

  options - snapshot options - `com.google.cloud.compute.deprecated.Compute$SnapshotOption`

  returns: a Snapshot object with latest information or null if not found - `com.google.cloud.compute.deprecated.Snapshot`

  throws: com.google.cloud.compute.deprecated.ComputeException - upon failure"
  (^com.google.cloud.compute.deprecated.Snapshot [^Snapshot this ^com.google.cloud.compute.deprecated.Compute$SnapshotOption options]
    (-> this (.reload options))))

(defn delete
  "Deletes this snapshot.

  options - `com.google.cloud.compute.deprecated.Compute$OperationOption`

  returns: a global operation if delete request was successfully sent, null if the
       snapshot was not found - `com.google.cloud.compute.deprecated.Operation`

  throws: com.google.cloud.compute.deprecated.ComputeException - upon failure"
  (^com.google.cloud.compute.deprecated.Operation [^Snapshot this ^com.google.cloud.compute.deprecated.Compute$OperationOption options]
    (-> this (.delete options))))

(defn get-compute
  "Returns the snapshot's Compute object used to issue requests.

  returns: `com.google.cloud.compute.deprecated.Compute`"
  (^com.google.cloud.compute.deprecated.Compute [^Snapshot this]
    (-> this (.getCompute))))

(defn to-builder
  "Description copied from class: SnapshotInfo

  returns: `com.google.cloud.compute.deprecated.Snapshot$Builder`"
  (^com.google.cloud.compute.deprecated.Snapshot$Builder [^Snapshot this]
    (-> this (.toBuilder))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^Snapshot this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn hash-code
  "returns: `int`"
  (^Integer [^Snapshot this]
    (-> this (.hashCode))))

