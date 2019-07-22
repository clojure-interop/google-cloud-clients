(ns com.google.cloud.compute.v1.RouterInterface$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 RouterInterface$Builder]))

(defn get-linked-interconnect-attachment
  "URI of the linked Interconnect attachment. It must be in the same region as the router. Each
   interface can have one linked resource, which can be either be a VPN tunnel or an
   Interconnect attachment.

  returns: `java.lang.String`"
  (^java.lang.String [^RouterInterface$Builder this]
    (-> this (.getLinkedInterconnectAttachment))))

(defn get-ip-range
  "IP address and range of the interface. The IP range must be in the RFC3927 link-local IP
   address space. The value must be a CIDR-formatted string, for example: 169.254.0.1/30. NOTE:
   Do not truncate the address as it represents the IP address of the interface.

  returns: `java.lang.String`"
  (^java.lang.String [^RouterInterface$Builder this]
    (-> this (.getIpRange))))

(defn set-linked-interconnect-attachment
  "URI of the linked Interconnect attachment. It must be in the same region as the router. Each
   interface can have one linked resource, which can be either be a VPN tunnel or an
   Interconnect attachment.

  linked-interconnect-attachment - `java.lang.String`

  returns: `com.google.cloud.compute.v1.RouterInterface$Builder`"
  (^com.google.cloud.compute.v1.RouterInterface$Builder [^RouterInterface$Builder this ^java.lang.String linked-interconnect-attachment]
    (-> this (.setLinkedInterconnectAttachment linked-interconnect-attachment))))

(defn get-linked-vpn-tunnel
  "URI of the linked VPN tunnel, which must be in the same region as the router. Each interface
   can have one linked resource, which can be either a VPN tunnel or an Interconnect attachment.

  returns: `java.lang.String`"
  (^java.lang.String [^RouterInterface$Builder this]
    (-> this (.getLinkedVpnTunnel))))

(defn set-name
  "Name of this interface entry. The name must be 1-63 characters long and comply with RFC1035.

  name - `java.lang.String`

  returns: `com.google.cloud.compute.v1.RouterInterface$Builder`"
  (^com.google.cloud.compute.v1.RouterInterface$Builder [^RouterInterface$Builder this ^java.lang.String name]
    (-> this (.setName name))))

(defn get-name
  "Name of this interface entry. The name must be 1-63 characters long and comply with RFC1035.

  returns: `java.lang.String`"
  (^java.lang.String [^RouterInterface$Builder this]
    (-> this (.getName))))

(defn build
  "returns: `com.google.cloud.compute.v1.RouterInterface`"
  (^com.google.cloud.compute.v1.RouterInterface [^RouterInterface$Builder this]
    (-> this (.build))))

(defn get-management-type
  "[Output Only] The resource that configures and manages this interface. - MANAGED_BY_USER is
   the default value and can be managed directly by users. - MANAGED_BY_ATTACHMENT is an
   interface that is configured and managed by Cloud Interconnect, specifically, by an
   InterconnectAttachment of type PARTNER. Google automatically creates, updates, and deletes
   this type of interface when the PARTNER InterconnectAttachment is created, updated, or
   deleted.

  returns: `java.lang.String`"
  (^java.lang.String [^RouterInterface$Builder this]
    (-> this (.getManagementType))))

(defn merge-from
  "other - `com.google.cloud.compute.v1.RouterInterface`

  returns: `com.google.cloud.compute.v1.RouterInterface$Builder`"
  (^com.google.cloud.compute.v1.RouterInterface$Builder [^RouterInterface$Builder this ^com.google.cloud.compute.v1.RouterInterface other]
    (-> this (.mergeFrom other))))

(defn clone
  "returns: `com.google.cloud.compute.v1.RouterInterface$Builder`"
  (^com.google.cloud.compute.v1.RouterInterface$Builder [^RouterInterface$Builder this]
    (-> this (.clone))))

(defn set-management-type
  "[Output Only] The resource that configures and manages this interface. - MANAGED_BY_USER is
   the default value and can be managed directly by users. - MANAGED_BY_ATTACHMENT is an
   interface that is configured and managed by Cloud Interconnect, specifically, by an
   InterconnectAttachment of type PARTNER. Google automatically creates, updates, and deletes
   this type of interface when the PARTNER InterconnectAttachment is created, updated, or
   deleted.

  management-type - `java.lang.String`

  returns: `com.google.cloud.compute.v1.RouterInterface$Builder`"
  (^com.google.cloud.compute.v1.RouterInterface$Builder [^RouterInterface$Builder this ^java.lang.String management-type]
    (-> this (.setManagementType management-type))))

(defn set-ip-range
  "IP address and range of the interface. The IP range must be in the RFC3927 link-local IP
   address space. The value must be a CIDR-formatted string, for example: 169.254.0.1/30. NOTE:
   Do not truncate the address as it represents the IP address of the interface.

  ip-range - `java.lang.String`

  returns: `com.google.cloud.compute.v1.RouterInterface$Builder`"
  (^com.google.cloud.compute.v1.RouterInterface$Builder [^RouterInterface$Builder this ^java.lang.String ip-range]
    (-> this (.setIpRange ip-range))))

(defn set-linked-vpn-tunnel
  "URI of the linked VPN tunnel, which must be in the same region as the router. Each interface
   can have one linked resource, which can be either a VPN tunnel or an Interconnect attachment.

  linked-vpn-tunnel - `java.lang.String`

  returns: `com.google.cloud.compute.v1.RouterInterface$Builder`"
  (^com.google.cloud.compute.v1.RouterInterface$Builder [^RouterInterface$Builder this ^java.lang.String linked-vpn-tunnel]
    (-> this (.setLinkedVpnTunnel linked-vpn-tunnel))))

