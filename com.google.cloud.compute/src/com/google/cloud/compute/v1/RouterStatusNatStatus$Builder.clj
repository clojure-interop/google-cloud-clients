(ns com.google.cloud.compute.v1.RouterStatusNatStatus$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 RouterStatusNatStatus$Builder]))

(defn set-min-extra-nat-ips-needed
  "The number of extra IPs to allocate. This will be greater than 0 only if user-specified IPs
   are NOT enough to allow all configured VMs to use NAT. This value is meaningful only when
   auto-allocation of NAT IPs is *not* used.

  min-extra-nat-ips-needed - `java.lang.Integer`

  returns: `com.google.cloud.compute.v1.RouterStatusNatStatus$Builder`"
  (^com.google.cloud.compute.v1.RouterStatusNatStatus$Builder [^RouterStatusNatStatus$Builder this ^java.lang.Integer min-extra-nat-ips-needed]
    (-> this (.setMinExtraNatIpsNeeded min-extra-nat-ips-needed))))

(defn add-all-user-allocated-nat-ip-resources
  "A list of fully qualified URLs of reserved IP address resources.

  user-allocated-nat-ip-resources - `java.util.List`

  returns: `com.google.cloud.compute.v1.RouterStatusNatStatus$Builder`"
  (^com.google.cloud.compute.v1.RouterStatusNatStatus$Builder [^RouterStatusNatStatus$Builder this ^java.util.List user-allocated-nat-ip-resources]
    (-> this (.addAllUserAllocatedNatIpResources user-allocated-nat-ip-resources))))

(defn get-num-vm-endpoints-with-nat-mappings
  "Number of VM endpoints (i.e., Nics) that can use NAT.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^RouterStatusNatStatus$Builder this]
    (-> this (.getNumVmEndpointsWithNatMappings))))

(defn add-auto-allocated-nat-ips
  "A list of IPs auto-allocated for NAT. Example: [\"1.1.1.1\", \"129.2.16.89\"]

  auto-allocated-nat-ips - `java.lang.String`

  returns: `com.google.cloud.compute.v1.RouterStatusNatStatus$Builder`"
  (^com.google.cloud.compute.v1.RouterStatusNatStatus$Builder [^RouterStatusNatStatus$Builder this ^java.lang.String auto-allocated-nat-ips]
    (-> this (.addAutoAllocatedNatIps auto-allocated-nat-ips))))

(defn set-num-vm-endpoints-with-nat-mappings
  "Number of VM endpoints (i.e., Nics) that can use NAT.

  num-vm-endpoints-with-nat-mappings - `java.lang.Integer`

  returns: `com.google.cloud.compute.v1.RouterStatusNatStatus$Builder`"
  (^com.google.cloud.compute.v1.RouterStatusNatStatus$Builder [^RouterStatusNatStatus$Builder this ^java.lang.Integer num-vm-endpoints-with-nat-mappings]
    (-> this (.setNumVmEndpointsWithNatMappings num-vm-endpoints-with-nat-mappings))))

(defn set-name
  "Unique name of this NAT.

  name - `java.lang.String`

  returns: `com.google.cloud.compute.v1.RouterStatusNatStatus$Builder`"
  (^com.google.cloud.compute.v1.RouterStatusNatStatus$Builder [^RouterStatusNatStatus$Builder this ^java.lang.String name]
    (-> this (.setName name))))

(defn get-auto-allocated-nat-ips-list
  "A list of IPs auto-allocated for NAT. Example: [\"1.1.1.1\", \"129.2.16.89\"]

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^RouterStatusNatStatus$Builder this]
    (-> this (.getAutoAllocatedNatIpsList))))

(defn get-name
  "Unique name of this NAT.

  returns: `java.lang.String`"
  (^java.lang.String [^RouterStatusNatStatus$Builder this]
    (-> this (.getName))))

(defn add-all-auto-allocated-nat-ips
  "A list of IPs auto-allocated for NAT. Example: [\"1.1.1.1\", \"129.2.16.89\"]

  auto-allocated-nat-ips - `java.util.List`

  returns: `com.google.cloud.compute.v1.RouterStatusNatStatus$Builder`"
  (^com.google.cloud.compute.v1.RouterStatusNatStatus$Builder [^RouterStatusNatStatus$Builder this ^java.util.List auto-allocated-nat-ips]
    (-> this (.addAllAutoAllocatedNatIps auto-allocated-nat-ips))))

(defn get-min-extra-nat-ips-needed
  "The number of extra IPs to allocate. This will be greater than 0 only if user-specified IPs
   are NOT enough to allow all configured VMs to use NAT. This value is meaningful only when
   auto-allocation of NAT IPs is *not* used.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^RouterStatusNatStatus$Builder this]
    (-> this (.getMinExtraNatIpsNeeded))))

(defn build
  "returns: `com.google.cloud.compute.v1.RouterStatusNatStatus`"
  (^com.google.cloud.compute.v1.RouterStatusNatStatus [^RouterStatusNatStatus$Builder this]
    (-> this (.build))))

(defn merge-from
  "other - `com.google.cloud.compute.v1.RouterStatusNatStatus`

  returns: `com.google.cloud.compute.v1.RouterStatusNatStatus$Builder`"
  (^com.google.cloud.compute.v1.RouterStatusNatStatus$Builder [^RouterStatusNatStatus$Builder this ^com.google.cloud.compute.v1.RouterStatusNatStatus other]
    (-> this (.mergeFrom other))))

(defn add-user-allocated-nat-ips
  "A list of IPs user-allocated for NAT. They will be raw IP strings like \"179.12.26.133\".

  user-allocated-nat-ips - `java.lang.String`

  returns: `com.google.cloud.compute.v1.RouterStatusNatStatus$Builder`"
  (^com.google.cloud.compute.v1.RouterStatusNatStatus$Builder [^RouterStatusNatStatus$Builder this ^java.lang.String user-allocated-nat-ips]
    (-> this (.addUserAllocatedNatIps user-allocated-nat-ips))))

(defn clone
  "returns: `com.google.cloud.compute.v1.RouterStatusNatStatus$Builder`"
  (^com.google.cloud.compute.v1.RouterStatusNatStatus$Builder [^RouterStatusNatStatus$Builder this]
    (-> this (.clone))))

(defn add-all-user-allocated-nat-ips
  "A list of IPs user-allocated for NAT. They will be raw IP strings like \"179.12.26.133\".

  user-allocated-nat-ips - `java.util.List`

  returns: `com.google.cloud.compute.v1.RouterStatusNatStatus$Builder`"
  (^com.google.cloud.compute.v1.RouterStatusNatStatus$Builder [^RouterStatusNatStatus$Builder this ^java.util.List user-allocated-nat-ips]
    (-> this (.addAllUserAllocatedNatIps user-allocated-nat-ips))))

(defn add-user-allocated-nat-ip-resources
  "A list of fully qualified URLs of reserved IP address resources.

  user-allocated-nat-ip-resources - `java.lang.String`

  returns: `com.google.cloud.compute.v1.RouterStatusNatStatus$Builder`"
  (^com.google.cloud.compute.v1.RouterStatusNatStatus$Builder [^RouterStatusNatStatus$Builder this ^java.lang.String user-allocated-nat-ip-resources]
    (-> this (.addUserAllocatedNatIpResources user-allocated-nat-ip-resources))))

(defn get-user-allocated-nat-ips-list
  "A list of IPs user-allocated for NAT. They will be raw IP strings like \"179.12.26.133\".

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^RouterStatusNatStatus$Builder this]
    (-> this (.getUserAllocatedNatIpsList))))

(defn get-user-allocated-nat-ip-resources-list
  "A list of fully qualified URLs of reserved IP address resources.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^RouterStatusNatStatus$Builder this]
    (-> this (.getUserAllocatedNatIpResourcesList))))

