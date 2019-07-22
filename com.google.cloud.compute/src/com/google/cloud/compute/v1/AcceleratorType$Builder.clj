(ns com.google.cloud.compute.v1.AcceleratorType$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 AcceleratorType$Builder]))

(defn set-description
  "[Output Only] An optional textual description of the resource.

  description - `java.lang.String`

  returns: `com.google.cloud.compute.v1.AcceleratorType$Builder`"
  (^com.google.cloud.compute.v1.AcceleratorType$Builder [^AcceleratorType$Builder this ^java.lang.String description]
    (-> this (.setDescription description))))

(defn set-creation-timestamp
  "[Output Only] Creation timestamp in RFC3339 text format.

  creation-timestamp - `java.lang.String`

  returns: `com.google.cloud.compute.v1.AcceleratorType$Builder`"
  (^com.google.cloud.compute.v1.AcceleratorType$Builder [^AcceleratorType$Builder this ^java.lang.String creation-timestamp]
    (-> this (.setCreationTimestamp creation-timestamp))))

(defn get-kind
  "[Output Only] The type of the resource. Always compute#acceleratorType for accelerator types.

  returns: `java.lang.String`"
  (^java.lang.String [^AcceleratorType$Builder this]
    (-> this (.getKind))))

(defn set-name
  "[Output Only] Name of the resource.

  name - `java.lang.String`

  returns: `com.google.cloud.compute.v1.AcceleratorType$Builder`"
  (^com.google.cloud.compute.v1.AcceleratorType$Builder [^AcceleratorType$Builder this ^java.lang.String name]
    (-> this (.setName name))))

(defn set-kind
  "[Output Only] The type of the resource. Always compute#acceleratorType for accelerator types.

  kind - `java.lang.String`

  returns: `com.google.cloud.compute.v1.AcceleratorType$Builder`"
  (^com.google.cloud.compute.v1.AcceleratorType$Builder [^AcceleratorType$Builder this ^java.lang.String kind]
    (-> this (.setKind kind))))

(defn get-name
  "[Output Only] Name of the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^AcceleratorType$Builder this]
    (-> this (.getName))))

(defn set-id
  "[Output Only] The unique identifier for the resource. This identifier is defined by the
   server.

  id - `java.lang.String`

  returns: `com.google.cloud.compute.v1.AcceleratorType$Builder`"
  (^com.google.cloud.compute.v1.AcceleratorType$Builder [^AcceleratorType$Builder this ^java.lang.String id]
    (-> this (.setId id))))

(defn set-maximum-cards-per-instance
  "[Output Only] Maximum accelerator cards allowed per instance.

  maximum-cards-per-instance - `java.lang.Integer`

  returns: `com.google.cloud.compute.v1.AcceleratorType$Builder`"
  (^com.google.cloud.compute.v1.AcceleratorType$Builder [^AcceleratorType$Builder this ^java.lang.Integer maximum-cards-per-instance]
    (-> this (.setMaximumCardsPerInstance maximum-cards-per-instance))))

(defn get-deprecated
  "[Output Only] The deprecation status associated with this accelerator type.

  returns: `com.google.cloud.compute.v1.DeprecationStatus`"
  (^com.google.cloud.compute.v1.DeprecationStatus [^AcceleratorType$Builder this]
    (-> this (.getDeprecated))))

(defn build
  "returns: `com.google.cloud.compute.v1.AcceleratorType`"
  (^com.google.cloud.compute.v1.AcceleratorType [^AcceleratorType$Builder this]
    (-> this (.build))))

(defn get-description
  "[Output Only] An optional textual description of the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^AcceleratorType$Builder this]
    (-> this (.getDescription))))

(defn get-id
  "[Output Only] The unique identifier for the resource. This identifier is defined by the
   server.

  returns: `java.lang.String`"
  (^java.lang.String [^AcceleratorType$Builder this]
    (-> this (.getId))))

(defn set-self-link
  "[Output Only] Server-defined fully-qualified URL for this resource.

  self-link - `java.lang.String`

  returns: `com.google.cloud.compute.v1.AcceleratorType$Builder`"
  (^com.google.cloud.compute.v1.AcceleratorType$Builder [^AcceleratorType$Builder this ^java.lang.String self-link]
    (-> this (.setSelfLink self-link))))

(defn merge-from
  "other - `com.google.cloud.compute.v1.AcceleratorType`

  returns: `com.google.cloud.compute.v1.AcceleratorType$Builder`"
  (^com.google.cloud.compute.v1.AcceleratorType$Builder [^AcceleratorType$Builder this ^com.google.cloud.compute.v1.AcceleratorType other]
    (-> this (.mergeFrom other))))

(defn set-zone
  "[Output Only] The name of the zone where the accelerator type resides, such as us-central1-a.
   You must specify this field as part of the HTTP request URL. It is not settable as a field in
   the request body.

  zone - `java.lang.String`

  returns: `com.google.cloud.compute.v1.AcceleratorType$Builder`"
  (^com.google.cloud.compute.v1.AcceleratorType$Builder [^AcceleratorType$Builder this ^java.lang.String zone]
    (-> this (.setZone zone))))

(defn get-self-link
  "[Output Only] Server-defined fully-qualified URL for this resource.

  returns: `java.lang.String`"
  (^java.lang.String [^AcceleratorType$Builder this]
    (-> this (.getSelfLink))))

(defn get-zone
  "[Output Only] The name of the zone where the accelerator type resides, such as us-central1-a.
   You must specify this field as part of the HTTP request URL. It is not settable as a field in
   the request body.

  returns: `java.lang.String`"
  (^java.lang.String [^AcceleratorType$Builder this]
    (-> this (.getZone))))

(defn clone
  "returns: `com.google.cloud.compute.v1.AcceleratorType$Builder`"
  (^com.google.cloud.compute.v1.AcceleratorType$Builder [^AcceleratorType$Builder this]
    (-> this (.clone))))

(defn get-creation-timestamp
  "[Output Only] Creation timestamp in RFC3339 text format.

  returns: `java.lang.String`"
  (^java.lang.String [^AcceleratorType$Builder this]
    (-> this (.getCreationTimestamp))))

(defn set-deprecated
  "[Output Only] The deprecation status associated with this accelerator type.

  deprecated - `com.google.cloud.compute.v1.DeprecationStatus`

  returns: `com.google.cloud.compute.v1.AcceleratorType$Builder`"
  (^com.google.cloud.compute.v1.AcceleratorType$Builder [^AcceleratorType$Builder this ^com.google.cloud.compute.v1.DeprecationStatus deprecated]
    (-> this (.setDeprecated deprecated))))

(defn get-maximum-cards-per-instance
  "[Output Only] Maximum accelerator cards allowed per instance.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^AcceleratorType$Builder this]
    (-> this (.getMaximumCardsPerInstance))))

