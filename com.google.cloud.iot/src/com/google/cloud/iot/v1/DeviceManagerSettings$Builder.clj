(ns com.google.cloud.iot.v1.DeviceManagerSettings$Builder
  "Builder for DeviceManagerSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.iot.v1 DeviceManagerSettings$Builder]))

(defn list-device-states-settings
  "Returns the builder for the settings used for calls to listDeviceStates.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.iot.v1.ListDeviceStatesRequest,com.google.cloud.iot.v1.ListDeviceStatesResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^DeviceManagerSettings$Builder this]
    (-> this (.listDeviceStatesSettings))))

(defn list-device-registries-settings
  "Returns the builder for the settings used for calls to listDeviceRegistries.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.iot.v1.ListDeviceRegistriesRequest,com.google.cloud.iot.v1.ListDeviceRegistriesResponse,com.google.cloud.iot.v1.DeviceManagerClient$ListDeviceRegistriesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^DeviceManagerSettings$Builder this]
    (-> this (.listDeviceRegistriesSettings))))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.iot.v1.DeviceManagerSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.iot.v1.DeviceManagerSettings$Builder [^DeviceManagerSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn modify-cloud-to-device-config-settings
  "Returns the builder for the settings used for calls to modifyCloudToDeviceConfig.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.iot.v1.ModifyCloudToDeviceConfigRequest,com.google.cloud.iot.v1.DeviceConfig>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^DeviceManagerSettings$Builder this]
    (-> this (.modifyCloudToDeviceConfigSettings))))

(defn get-device-registry-settings
  "Returns the builder for the settings used for calls to getDeviceRegistry.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.iot.v1.GetDeviceRegistryRequest,com.google.cloud.iot.v1.DeviceRegistry>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^DeviceManagerSettings$Builder this]
    (-> this (.getDeviceRegistrySettings))))

(defn test-iam-permissions-settings
  "Returns the builder for the settings used for calls to testIamPermissions.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.iam.v1.TestIamPermissionsRequest,com.google.iam.v1.TestIamPermissionsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^DeviceManagerSettings$Builder this]
    (-> this (.testIamPermissionsSettings))))

(defn bind-device-to-gateway-settings
  "Returns the builder for the settings used for calls to bindDeviceToGateway.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.iot.v1.BindDeviceToGatewayRequest,com.google.cloud.iot.v1.BindDeviceToGatewayResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^DeviceManagerSettings$Builder this]
    (-> this (.bindDeviceToGatewaySettings))))

(defn set-iam-policy-settings
  "Returns the builder for the settings used for calls to setIamPolicy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.iam.v1.SetIamPolicyRequest,com.google.iam.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^DeviceManagerSettings$Builder this]
    (-> this (.setIamPolicySettings))))

(defn build
  "returns: `com.google.cloud.iot.v1.DeviceManagerSettings`

  throws: java.io.IOException"
  (^com.google.cloud.iot.v1.DeviceManagerSettings [^DeviceManagerSettings$Builder this]
    (-> this (.build))))

(defn get-device-settings
  "Returns the builder for the settings used for calls to getDevice.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.iot.v1.GetDeviceRequest,com.google.cloud.iot.v1.Device>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^DeviceManagerSettings$Builder this]
    (-> this (.getDeviceSettings))))

(defn get-stub-settings-builder
  "returns: `com.google.cloud.iot.v1.stub.DeviceManagerStubSettings$Builder`"
  (^com.google.cloud.iot.v1.stub.DeviceManagerStubSettings$Builder [^DeviceManagerSettings$Builder this]
    (-> this (.getStubSettingsBuilder))))

(defn list-devices-settings
  "Returns the builder for the settings used for calls to listDevices.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.iot.v1.ListDevicesRequest,com.google.cloud.iot.v1.ListDevicesResponse,com.google.cloud.iot.v1.DeviceManagerClient$ListDevicesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^DeviceManagerSettings$Builder this]
    (-> this (.listDevicesSettings))))

(defn create-device-settings
  "Returns the builder for the settings used for calls to createDevice.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.iot.v1.CreateDeviceRequest,com.google.cloud.iot.v1.Device>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^DeviceManagerSettings$Builder this]
    (-> this (.createDeviceSettings))))

(defn unbind-device-from-gateway-settings
  "Returns the builder for the settings used for calls to unbindDeviceFromGateway.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.iot.v1.UnbindDeviceFromGatewayRequest,com.google.cloud.iot.v1.UnbindDeviceFromGatewayResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^DeviceManagerSettings$Builder this]
    (-> this (.unbindDeviceFromGatewaySettings))))

(defn update-device-settings
  "Returns the builder for the settings used for calls to updateDevice.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.iot.v1.UpdateDeviceRequest,com.google.cloud.iot.v1.Device>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^DeviceManagerSettings$Builder this]
    (-> this (.updateDeviceSettings))))

(defn delete-device-registry-settings
  "Returns the builder for the settings used for calls to deleteDeviceRegistry.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.iot.v1.DeleteDeviceRegistryRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^DeviceManagerSettings$Builder this]
    (-> this (.deleteDeviceRegistrySettings))))

(defn get-iam-policy-settings
  "Returns the builder for the settings used for calls to getIamPolicy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.iam.v1.GetIamPolicyRequest,com.google.iam.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^DeviceManagerSettings$Builder this]
    (-> this (.getIamPolicySettings))))

(defn create-device-registry-settings
  "Returns the builder for the settings used for calls to createDeviceRegistry.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.iot.v1.CreateDeviceRegistryRequest,com.google.cloud.iot.v1.DeviceRegistry>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^DeviceManagerSettings$Builder this]
    (-> this (.createDeviceRegistrySettings))))

(defn delete-device-settings
  "Returns the builder for the settings used for calls to deleteDevice.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.iot.v1.DeleteDeviceRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^DeviceManagerSettings$Builder this]
    (-> this (.deleteDeviceSettings))))

(defn list-device-config-versions-settings
  "Returns the builder for the settings used for calls to listDeviceConfigVersions.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.iot.v1.ListDeviceConfigVersionsRequest,com.google.cloud.iot.v1.ListDeviceConfigVersionsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^DeviceManagerSettings$Builder this]
    (-> this (.listDeviceConfigVersionsSettings))))

(defn send-command-to-device-settings
  "Returns the builder for the settings used for calls to sendCommandToDevice.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.iot.v1.SendCommandToDeviceRequest,com.google.cloud.iot.v1.SendCommandToDeviceResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^DeviceManagerSettings$Builder this]
    (-> this (.sendCommandToDeviceSettings))))

(defn update-device-registry-settings
  "Returns the builder for the settings used for calls to updateDeviceRegistry.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.iot.v1.UpdateDeviceRegistryRequest,com.google.cloud.iot.v1.DeviceRegistry>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^DeviceManagerSettings$Builder this]
    (-> this (.updateDeviceRegistrySettings))))

