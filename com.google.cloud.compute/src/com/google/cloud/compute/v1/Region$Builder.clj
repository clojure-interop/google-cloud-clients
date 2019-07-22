(ns com.google.cloud.compute.v1.Region$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 Region$Builder]))

(defn set-description
  "[Output Only] Textual description of the resource.

  description - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Region$Builder`"
  (^com.google.cloud.compute.v1.Region$Builder [^Region$Builder this ^java.lang.String description]
    (-> this (.setDescription description))))

(defn set-creation-timestamp
  "[Output Only] Creation timestamp in RFC3339 text format.

  creation-timestamp - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Region$Builder`"
  (^com.google.cloud.compute.v1.Region$Builder [^Region$Builder this ^java.lang.String creation-timestamp]
    (-> this (.setCreationTimestamp creation-timestamp))))

(defn add-zones
  "[Output Only] A list of zones available in this region, in the form of resource URLs.

  zones - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Region$Builder`"
  (^com.google.cloud.compute.v1.Region$Builder [^Region$Builder this ^java.lang.String zones]
    (-> this (.addZones zones))))

(defn get-kind
  "[Output Only] Type of the resource. Always compute#region for regions.

  returns: `java.lang.String`"
  (^java.lang.String [^Region$Builder this]
    (-> this (.getKind))))

(defn get-status
  "[Output Only] Status of the region, either UP or DOWN.

  returns: `java.lang.String`"
  (^java.lang.String [^Region$Builder this]
    (-> this (.getStatus))))

(defn get-zones-list
  "[Output Only] A list of zones available in this region, in the form of resource URLs.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^Region$Builder this]
    (-> this (.getZonesList))))

(defn add-all-quotas
  "[Output Only] Quotas assigned to this region.

  quotas - `java.util.List`

  returns: `com.google.cloud.compute.v1.Region$Builder`"
  (^com.google.cloud.compute.v1.Region$Builder [^Region$Builder this ^java.util.List quotas]
    (-> this (.addAllQuotas quotas))))

(defn set-name
  "[Output Only] Name of the resource.

  name - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Region$Builder`"
  (^com.google.cloud.compute.v1.Region$Builder [^Region$Builder this ^java.lang.String name]
    (-> this (.setName name))))

(defn set-kind
  "[Output Only] Type of the resource. Always compute#region for regions.

  kind - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Region$Builder`"
  (^com.google.cloud.compute.v1.Region$Builder [^Region$Builder this ^java.lang.String kind]
    (-> this (.setKind kind))))

(defn get-name
  "[Output Only] Name of the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^Region$Builder this]
    (-> this (.getName))))

(defn add-all-zones
  "[Output Only] A list of zones available in this region, in the form of resource URLs.

  zones - `java.util.List`

  returns: `com.google.cloud.compute.v1.Region$Builder`"
  (^com.google.cloud.compute.v1.Region$Builder [^Region$Builder this ^java.util.List zones]
    (-> this (.addAllZones zones))))

(defn set-id
  "[Output Only] The unique identifier for the resource. This identifier is defined by the
   server.

  id - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Region$Builder`"
  (^com.google.cloud.compute.v1.Region$Builder [^Region$Builder this ^java.lang.String id]
    (-> this (.setId id))))

(defn add-quotas
  "[Output Only] Quotas assigned to this region.

  quotas - `com.google.cloud.compute.v1.Quota`

  returns: `com.google.cloud.compute.v1.Region$Builder`"
  (^com.google.cloud.compute.v1.Region$Builder [^Region$Builder this ^com.google.cloud.compute.v1.Quota quotas]
    (-> this (.addQuotas quotas))))

(defn get-deprecated
  "[Output Only] The deprecation status associated with this region.

  returns: `com.google.cloud.compute.v1.DeprecationStatus`"
  (^com.google.cloud.compute.v1.DeprecationStatus [^Region$Builder this]
    (-> this (.getDeprecated))))

(defn build
  "returns: `com.google.cloud.compute.v1.Region`"
  (^com.google.cloud.compute.v1.Region [^Region$Builder this]
    (-> this (.build))))

(defn get-description
  "[Output Only] Textual description of the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^Region$Builder this]
    (-> this (.getDescription))))

(defn get-quotas-list
  "[Output Only] Quotas assigned to this region.

  returns: `java.util.List<com.google.cloud.compute.v1.Quota>`"
  (^java.util.List [^Region$Builder this]
    (-> this (.getQuotasList))))

(defn get-id
  "[Output Only] The unique identifier for the resource. This identifier is defined by the
   server.

  returns: `java.lang.String`"
  (^java.lang.String [^Region$Builder this]
    (-> this (.getId))))

(defn set-self-link
  "[Output Only] Server-defined URL for the resource.

  self-link - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Region$Builder`"
  (^com.google.cloud.compute.v1.Region$Builder [^Region$Builder this ^java.lang.String self-link]
    (-> this (.setSelfLink self-link))))

(defn merge-from
  "other - `com.google.cloud.compute.v1.Region`

  returns: `com.google.cloud.compute.v1.Region$Builder`"
  (^com.google.cloud.compute.v1.Region$Builder [^Region$Builder this ^com.google.cloud.compute.v1.Region other]
    (-> this (.mergeFrom other))))

(defn get-self-link
  "[Output Only] Server-defined URL for the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^Region$Builder this]
    (-> this (.getSelfLink))))

(defn clone
  "returns: `com.google.cloud.compute.v1.Region$Builder`"
  (^com.google.cloud.compute.v1.Region$Builder [^Region$Builder this]
    (-> this (.clone))))

(defn get-creation-timestamp
  "[Output Only] Creation timestamp in RFC3339 text format.

  returns: `java.lang.String`"
  (^java.lang.String [^Region$Builder this]
    (-> this (.getCreationTimestamp))))

(defn set-deprecated
  "[Output Only] The deprecation status associated with this region.

  deprecated - `com.google.cloud.compute.v1.DeprecationStatus`

  returns: `com.google.cloud.compute.v1.Region$Builder`"
  (^com.google.cloud.compute.v1.Region$Builder [^Region$Builder this ^com.google.cloud.compute.v1.DeprecationStatus deprecated]
    (-> this (.setDeprecated deprecated))))

(defn set-status
  "[Output Only] Status of the region, either UP or DOWN.

  status - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Region$Builder`"
  (^com.google.cloud.compute.v1.Region$Builder [^Region$Builder this ^java.lang.String status]
    (-> this (.setStatus status))))

