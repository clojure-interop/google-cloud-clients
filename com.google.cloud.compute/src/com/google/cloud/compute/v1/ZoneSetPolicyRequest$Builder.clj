(ns com.google.cloud.compute.v1.ZoneSetPolicyRequest$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ZoneSetPolicyRequest$Builder]))

(defn add-all-bindings
  "Flatten Policy to create a backwacd compatible wire-format. Deprecated. Use 'policy' to
   specify bindings.

  bindings - `java.util.List`

  returns: `com.google.cloud.compute.v1.ZoneSetPolicyRequest$Builder`"
  (^com.google.cloud.compute.v1.ZoneSetPolicyRequest$Builder [^ZoneSetPolicyRequest$Builder this ^java.util.List bindings]
    (-> this (.addAllBindings bindings))))

(defn set-policy
  "REQUIRED: The complete policy to be applied to the 'resource'. The size of the policy is
   limited to a few 10s of KB. An empty policy is in general a valid policy but certain services
   (like Projects) might reject them.

  policy - `com.google.cloud.compute.v1.Policy`

  returns: `com.google.cloud.compute.v1.ZoneSetPolicyRequest$Builder`"
  (^com.google.cloud.compute.v1.ZoneSetPolicyRequest$Builder [^ZoneSetPolicyRequest$Builder this ^com.google.cloud.compute.v1.Policy policy]
    (-> this (.setPolicy policy))))

(defn set-etag
  "Flatten Policy to create a backward compatible wire-format. Deprecated. Use 'policy' to
   specify the etag.

  etag - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ZoneSetPolicyRequest$Builder`"
  (^com.google.cloud.compute.v1.ZoneSetPolicyRequest$Builder [^ZoneSetPolicyRequest$Builder this ^java.lang.String etag]
    (-> this (.setEtag etag))))

(defn get-etag
  "Flatten Policy to create a backward compatible wire-format. Deprecated. Use 'policy' to
   specify the etag.

  returns: `java.lang.String`"
  (^java.lang.String [^ZoneSetPolicyRequest$Builder this]
    (-> this (.getEtag))))

(defn build
  "returns: `com.google.cloud.compute.v1.ZoneSetPolicyRequest`"
  (^com.google.cloud.compute.v1.ZoneSetPolicyRequest [^ZoneSetPolicyRequest$Builder this]
    (-> this (.build))))

(defn add-bindings
  "Flatten Policy to create a backwacd compatible wire-format. Deprecated. Use 'policy' to
   specify bindings.

  bindings - `com.google.cloud.compute.v1.Binding`

  returns: `com.google.cloud.compute.v1.ZoneSetPolicyRequest$Builder`"
  (^com.google.cloud.compute.v1.ZoneSetPolicyRequest$Builder [^ZoneSetPolicyRequest$Builder this ^com.google.cloud.compute.v1.Binding bindings]
    (-> this (.addBindings bindings))))

(defn merge-from
  "other - `com.google.cloud.compute.v1.ZoneSetPolicyRequest`

  returns: `com.google.cloud.compute.v1.ZoneSetPolicyRequest$Builder`"
  (^com.google.cloud.compute.v1.ZoneSetPolicyRequest$Builder [^ZoneSetPolicyRequest$Builder this ^com.google.cloud.compute.v1.ZoneSetPolicyRequest other]
    (-> this (.mergeFrom other))))

(defn get-policy
  "REQUIRED: The complete policy to be applied to the 'resource'. The size of the policy is
   limited to a few 10s of KB. An empty policy is in general a valid policy but certain services
   (like Projects) might reject them.

  returns: `com.google.cloud.compute.v1.Policy`"
  (^com.google.cloud.compute.v1.Policy [^ZoneSetPolicyRequest$Builder this]
    (-> this (.getPolicy))))

(defn clone
  "returns: `com.google.cloud.compute.v1.ZoneSetPolicyRequest$Builder`"
  (^com.google.cloud.compute.v1.ZoneSetPolicyRequest$Builder [^ZoneSetPolicyRequest$Builder this]
    (-> this (.clone))))

(defn get-bindings-list
  "Flatten Policy to create a backwacd compatible wire-format. Deprecated. Use 'policy' to
   specify bindings.

  returns: `java.util.List<com.google.cloud.compute.v1.Binding>`"
  (^java.util.List [^ZoneSetPolicyRequest$Builder this]
    (-> this (.getBindingsList))))

