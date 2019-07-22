(ns com.google.cloud.compute.v1.TargetInstance$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 TargetInstance$Builder]))

(defn set-description
  "An optional description of this resource. Provide this property when you create the resource.

  description - `java.lang.String`

  returns: `com.google.cloud.compute.v1.TargetInstance$Builder`"
  (^com.google.cloud.compute.v1.TargetInstance$Builder [^TargetInstance$Builder this ^java.lang.String description]
    (-> this (.setDescription description))))

(defn set-creation-timestamp
  "[Output Only] Creation timestamp in RFC3339 text format.

  creation-timestamp - `java.lang.String`

  returns: `com.google.cloud.compute.v1.TargetInstance$Builder`"
  (^com.google.cloud.compute.v1.TargetInstance$Builder [^TargetInstance$Builder this ^java.lang.String creation-timestamp]
    (-> this (.setCreationTimestamp creation-timestamp))))

(defn set-nat-policy
  "NAT option controlling how IPs are NAT'ed to the instance. Currently only NO_NAT (default
   value) is supported.

  nat-policy - `java.lang.String`

  returns: `com.google.cloud.compute.v1.TargetInstance$Builder`"
  (^com.google.cloud.compute.v1.TargetInstance$Builder [^TargetInstance$Builder this ^java.lang.String nat-policy]
    (-> this (.setNatPolicy nat-policy))))

(defn get-kind
  "[Output Only] The type of the resource. Always compute#targetInstance for target instances.

  returns: `java.lang.String`"
  (^java.lang.String [^TargetInstance$Builder this]
    (-> this (.getKind))))

(defn set-name
  "Name of the resource. Provided by the client when the resource is created. The name must be
   1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first
   character must be a lowercase letter, and all following characters must be a dash, lowercase
   letter, or digit, except the last character, which cannot be a dash.

  name - `java.lang.String`

  returns: `com.google.cloud.compute.v1.TargetInstance$Builder`"
  (^com.google.cloud.compute.v1.TargetInstance$Builder [^TargetInstance$Builder this ^java.lang.String name]
    (-> this (.setName name))))

(defn set-kind
  "[Output Only] The type of the resource. Always compute#targetInstance for target instances.

  kind - `java.lang.String`

  returns: `com.google.cloud.compute.v1.TargetInstance$Builder`"
  (^com.google.cloud.compute.v1.TargetInstance$Builder [^TargetInstance$Builder this ^java.lang.String kind]
    (-> this (.setKind kind))))

(defn get-name
  "Name of the resource. Provided by the client when the resource is created. The name must be
   1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first
   character must be a lowercase letter, and all following characters must be a dash, lowercase
   letter, or digit, except the last character, which cannot be a dash.

  returns: `java.lang.String`"
  (^java.lang.String [^TargetInstance$Builder this]
    (-> this (.getName))))

(defn set-id
  "[Output Only] The unique identifier for the resource. This identifier is defined by the
   server.

  id - `java.lang.String`

  returns: `com.google.cloud.compute.v1.TargetInstance$Builder`"
  (^com.google.cloud.compute.v1.TargetInstance$Builder [^TargetInstance$Builder this ^java.lang.String id]
    (-> this (.setId id))))

(defn get-instance
  "A URL to the virtual machine instance that handles traffic for this target instance. When
   creating a target instance, you can provide the fully-qualified URL or a valid partial URL to
   the desired virtual machine. For example, the following are all valid URLs: -
   https://www.googleapis.com/compute/v1/projects/project/zones/zone/instances/instance -
   projects/project/zones/zone/instances/instance - zones/zone/instances/instance

  returns: `java.lang.String`"
  (^java.lang.String [^TargetInstance$Builder this]
    (-> this (.getInstance))))

(defn build
  "returns: `com.google.cloud.compute.v1.TargetInstance`"
  (^com.google.cloud.compute.v1.TargetInstance [^TargetInstance$Builder this]
    (-> this (.build))))

(defn get-description
  "An optional description of this resource. Provide this property when you create the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^TargetInstance$Builder this]
    (-> this (.getDescription))))

(defn get-id
  "[Output Only] The unique identifier for the resource. This identifier is defined by the
   server.

  returns: `java.lang.String`"
  (^java.lang.String [^TargetInstance$Builder this]
    (-> this (.getId))))

(defn set-self-link
  "[Output Only] Server-defined URL for the resource.

  self-link - `java.lang.String`

  returns: `com.google.cloud.compute.v1.TargetInstance$Builder`"
  (^com.google.cloud.compute.v1.TargetInstance$Builder [^TargetInstance$Builder this ^java.lang.String self-link]
    (-> this (.setSelfLink self-link))))

(defn merge-from
  "other - `com.google.cloud.compute.v1.TargetInstance`

  returns: `com.google.cloud.compute.v1.TargetInstance$Builder`"
  (^com.google.cloud.compute.v1.TargetInstance$Builder [^TargetInstance$Builder this ^com.google.cloud.compute.v1.TargetInstance other]
    (-> this (.mergeFrom other))))

(defn set-zone
  "[Output Only] URL of the zone where the target instance resides. You must specify this field
   as part of the HTTP request URL. It is not settable as a field in the request body.

  zone - `java.lang.String`

  returns: `com.google.cloud.compute.v1.TargetInstance$Builder`"
  (^com.google.cloud.compute.v1.TargetInstance$Builder [^TargetInstance$Builder this ^java.lang.String zone]
    (-> this (.setZone zone))))

(defn get-self-link
  "[Output Only] Server-defined URL for the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^TargetInstance$Builder this]
    (-> this (.getSelfLink))))

(defn get-zone
  "[Output Only] URL of the zone where the target instance resides. You must specify this field
   as part of the HTTP request URL. It is not settable as a field in the request body.

  returns: `java.lang.String`"
  (^java.lang.String [^TargetInstance$Builder this]
    (-> this (.getZone))))

(defn set-instance
  "A URL to the virtual machine instance that handles traffic for this target instance. When
   creating a target instance, you can provide the fully-qualified URL or a valid partial URL to
   the desired virtual machine. For example, the following are all valid URLs: -
   https://www.googleapis.com/compute/v1/projects/project/zones/zone/instances/instance -
   projects/project/zones/zone/instances/instance - zones/zone/instances/instance

  instance - `java.lang.String`

  returns: `com.google.cloud.compute.v1.TargetInstance$Builder`"
  (^com.google.cloud.compute.v1.TargetInstance$Builder [^TargetInstance$Builder this ^java.lang.String instance]
    (-> this (.setInstance instance))))

(defn clone
  "returns: `com.google.cloud.compute.v1.TargetInstance$Builder`"
  (^com.google.cloud.compute.v1.TargetInstance$Builder [^TargetInstance$Builder this]
    (-> this (.clone))))

(defn get-creation-timestamp
  "[Output Only] Creation timestamp in RFC3339 text format.

  returns: `java.lang.String`"
  (^java.lang.String [^TargetInstance$Builder this]
    (-> this (.getCreationTimestamp))))

(defn get-nat-policy
  "NAT option controlling how IPs are NAT'ed to the instance. Currently only NO_NAT (default
   value) is supported.

  returns: `java.lang.String`"
  (^java.lang.String [^TargetInstance$Builder this]
    (-> this (.getNatPolicy))))

