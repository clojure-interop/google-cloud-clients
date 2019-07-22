(ns com.google.cloud.compute.deprecated.SnapshotId
  "Identity for a Google Compute Engine snapshot."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated SnapshotId]))

(defn *of
  "Returns a snapshot identity given project and snapshot names. The snapshot name must be 1-63
   characters long and comply with RFC1035. Specifically, the name must match the regular
   expression [a-z]([-a-z0-9]*[a-z0-9])? which means the first character must be a
   lowercase letter, and all following characters must be a dash, lowercase letter, or digit,
   except the last character, which cannot be a dash.

  project - `java.lang.String`
  snapshot - `java.lang.String`

  returns: `com.google.cloud.compute.deprecated.SnapshotId`"
  (^com.google.cloud.compute.deprecated.SnapshotId [^java.lang.String project ^java.lang.String snapshot]
    (SnapshotId/of project snapshot))
  (^com.google.cloud.compute.deprecated.SnapshotId [^java.lang.String snapshot]
    (SnapshotId/of snapshot)))

(defn get-snapshot
  "Returns the name of the snapshot. The name must be 1-63 characters long and comply with
   RFC1035. Specifically, the name must match the regular expression [a-z]([-a-z0-9]*[a-z0-9])? which means the first character must be a lowercase letter, and all
   following characters must be a dash, lowercase letter, or digit, except the last character,
   which cannot be a dash.

  returns: `java.lang.String`"
  (^java.lang.String [^SnapshotId this]
    (-> this (.getSnapshot))))

(defn get-self-link
  "Description copied from class: ResourceId

  returns: `java.lang.String`"
  (^java.lang.String [^SnapshotId this]
    (-> this (.getSelfLink))))

(defn hash-code
  "returns: `int`"
  (^Integer [^SnapshotId this]
    (-> this (.hashCode))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^SnapshotId this ^java.lang.Object obj]
    (-> this (.equals obj))))

