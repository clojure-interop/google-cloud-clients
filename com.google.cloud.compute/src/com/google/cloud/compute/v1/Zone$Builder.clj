(ns com.google.cloud.compute.v1.Zone$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 Zone$Builder]))

(defn set-description
  "[Output Only] Textual description of the resource.

  description - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Zone$Builder`"
  (^com.google.cloud.compute.v1.Zone$Builder [^Zone$Builder this ^java.lang.String description]
    (-> this (.setDescription description))))

(defn set-region
  "[Output Only] Full URL reference to the region which hosts the zone.

  region - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Zone$Builder`"
  (^com.google.cloud.compute.v1.Zone$Builder [^Zone$Builder this ^java.lang.String region]
    (-> this (.setRegion region))))

(defn set-creation-timestamp
  "[Output Only] Creation timestamp in RFC3339 text format.

  creation-timestamp - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Zone$Builder`"
  (^com.google.cloud.compute.v1.Zone$Builder [^Zone$Builder this ^java.lang.String creation-timestamp]
    (-> this (.setCreationTimestamp creation-timestamp))))

(defn get-kind
  "[Output Only] Type of the resource. Always compute#zone for zones.

  returns: `java.lang.String`"
  (^java.lang.String [^Zone$Builder this]
    (-> this (.getKind))))

(defn get-status
  "[Output Only] Status of the zone, either UP or DOWN.

  returns: `java.lang.String`"
  (^java.lang.String [^Zone$Builder this]
    (-> this (.getStatus))))

(defn get-available-cpu-platforms-list
  "[Output Only] Available cpu/platform selections for the zone.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^Zone$Builder this]
    (-> this (.getAvailableCpuPlatformsList))))

(defn add-all-available-cpu-platforms
  "[Output Only] Available cpu/platform selections for the zone.

  available-cpu-platforms - `java.util.List`

  returns: `com.google.cloud.compute.v1.Zone$Builder`"
  (^com.google.cloud.compute.v1.Zone$Builder [^Zone$Builder this ^java.util.List available-cpu-platforms]
    (-> this (.addAllAvailableCpuPlatforms available-cpu-platforms))))

(defn set-name
  "[Output Only] Name of the resource.

  name - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Zone$Builder`"
  (^com.google.cloud.compute.v1.Zone$Builder [^Zone$Builder this ^java.lang.String name]
    (-> this (.setName name))))

(defn set-kind
  "[Output Only] Type of the resource. Always compute#zone for zones.

  kind - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Zone$Builder`"
  (^com.google.cloud.compute.v1.Zone$Builder [^Zone$Builder this ^java.lang.String kind]
    (-> this (.setKind kind))))

(defn get-name
  "[Output Only] Name of the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^Zone$Builder this]
    (-> this (.getName))))

(defn set-id
  "[Output Only] The unique identifier for the resource. This identifier is defined by the
   server.

  id - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Zone$Builder`"
  (^com.google.cloud.compute.v1.Zone$Builder [^Zone$Builder this ^java.lang.String id]
    (-> this (.setId id))))

(defn get-deprecated
  "[Output Only] The deprecation status associated with this zone.

  returns: `com.google.cloud.compute.v1.DeprecationStatus`"
  (^com.google.cloud.compute.v1.DeprecationStatus [^Zone$Builder this]
    (-> this (.getDeprecated))))

(defn add-available-cpu-platforms
  "[Output Only] Available cpu/platform selections for the zone.

  available-cpu-platforms - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Zone$Builder`"
  (^com.google.cloud.compute.v1.Zone$Builder [^Zone$Builder this ^java.lang.String available-cpu-platforms]
    (-> this (.addAvailableCpuPlatforms available-cpu-platforms))))

(defn build
  "returns: `com.google.cloud.compute.v1.Zone`"
  (^com.google.cloud.compute.v1.Zone [^Zone$Builder this]
    (-> this (.build))))

(defn get-description
  "[Output Only] Textual description of the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^Zone$Builder this]
    (-> this (.getDescription))))

(defn get-id
  "[Output Only] The unique identifier for the resource. This identifier is defined by the
   server.

  returns: `java.lang.String`"
  (^java.lang.String [^Zone$Builder this]
    (-> this (.getId))))

(defn set-self-link
  "[Output Only] Server-defined URL for the resource.

  self-link - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Zone$Builder`"
  (^com.google.cloud.compute.v1.Zone$Builder [^Zone$Builder this ^java.lang.String self-link]
    (-> this (.setSelfLink self-link))))

(defn merge-from
  "other - `com.google.cloud.compute.v1.Zone`

  returns: `com.google.cloud.compute.v1.Zone$Builder`"
  (^com.google.cloud.compute.v1.Zone$Builder [^Zone$Builder this ^com.google.cloud.compute.v1.Zone other]
    (-> this (.mergeFrom other))))

(defn get-self-link
  "[Output Only] Server-defined URL for the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^Zone$Builder this]
    (-> this (.getSelfLink))))

(defn clone
  "returns: `com.google.cloud.compute.v1.Zone$Builder`"
  (^com.google.cloud.compute.v1.Zone$Builder [^Zone$Builder this]
    (-> this (.clone))))

(defn get-creation-timestamp
  "[Output Only] Creation timestamp in RFC3339 text format.

  returns: `java.lang.String`"
  (^java.lang.String [^Zone$Builder this]
    (-> this (.getCreationTimestamp))))

(defn set-deprecated
  "[Output Only] The deprecation status associated with this zone.

  deprecated - `com.google.cloud.compute.v1.DeprecationStatus`

  returns: `com.google.cloud.compute.v1.Zone$Builder`"
  (^com.google.cloud.compute.v1.Zone$Builder [^Zone$Builder this ^com.google.cloud.compute.v1.DeprecationStatus deprecated]
    (-> this (.setDeprecated deprecated))))

(defn set-status
  "[Output Only] Status of the zone, either UP or DOWN.

  status - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Zone$Builder`"
  (^com.google.cloud.compute.v1.Zone$Builder [^Zone$Builder this ^java.lang.String status]
    (-> this (.setStatus status))))

(defn get-region
  "[Output Only] Full URL reference to the region which hosts the zone.

  returns: `java.lang.String`"
  (^java.lang.String [^Zone$Builder this]
    (-> this (.getRegion))))

