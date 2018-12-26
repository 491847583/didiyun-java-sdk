// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: compute/v1/sg.proto

package com.didiyun.compute.v1;

/**
 * Protobuf type {@code didi.cloud.compute.v1.ListSgRuleCondition}
 */
public  final class ListSgRuleCondition extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:didi.cloud.compute.v1.ListSgRuleCondition)
    ListSgRuleConditionOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListSgRuleCondition.newBuilder() to construct.
  private ListSgRuleCondition(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListSgRuleCondition() {
    sgUuid_ = "";
    dc2Uuid_ = "";
    type_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ListSgRuleCondition(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            sgUuid_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            dc2Uuid_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            type_ = s;
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.didiyun.compute.v1.SgOuterClass.internal_static_didi_cloud_compute_v1_ListSgRuleCondition_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.didiyun.compute.v1.SgOuterClass.internal_static_didi_cloud_compute_v1_ListSgRuleCondition_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.didiyun.compute.v1.ListSgRuleCondition.class, com.didiyun.compute.v1.ListSgRuleCondition.Builder.class);
  }

  public static final int SGUUID_FIELD_NUMBER = 1;
  private volatile java.lang.Object sgUuid_;
  /**
   * <pre>
   *查看此SG下的SGRule列表
   * </pre>
   *
   * <code>string sgUuid = 1;</code>
   */
  public java.lang.String getSgUuid() {
    java.lang.Object ref = sgUuid_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      sgUuid_ = s;
      return s;
    }
  }
  /**
   * <pre>
   *查看此SG下的SGRule列表
   * </pre>
   *
   * <code>string sgUuid = 1;</code>
   */
  public com.google.protobuf.ByteString
      getSgUuidBytes() {
    java.lang.Object ref = sgUuid_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      sgUuid_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DC2UUID_FIELD_NUMBER = 2;
  private volatile java.lang.Object dc2Uuid_;
  /**
   * <pre>
   *查看此DC2遵循的SGRule列表
   * </pre>
   *
   * <code>string dc2Uuid = 2;</code>
   */
  public java.lang.String getDc2Uuid() {
    java.lang.Object ref = dc2Uuid_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      dc2Uuid_ = s;
      return s;
    }
  }
  /**
   * <pre>
   *查看此DC2遵循的SGRule列表
   * </pre>
   *
   * <code>string dc2Uuid = 2;</code>
   */
  public com.google.protobuf.ByteString
      getDc2UuidBytes() {
    java.lang.Object ref = dc2Uuid_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      dc2Uuid_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TYPE_FIELD_NUMBER = 3;
  private volatile java.lang.Object type_;
  /**
   * <pre>
   *要查询的SGRule类型，"Ingress"为入方向，"Egress"为出方向
   * </pre>
   *
   * <code>string type = 3;</code>
   */
  public java.lang.String getType() {
    java.lang.Object ref = type_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      type_ = s;
      return s;
    }
  }
  /**
   * <pre>
   *要查询的SGRule类型，"Ingress"为入方向，"Egress"为出方向
   * </pre>
   *
   * <code>string type = 3;</code>
   */
  public com.google.protobuf.ByteString
      getTypeBytes() {
    java.lang.Object ref = type_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      type_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getSgUuidBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, sgUuid_);
    }
    if (!getDc2UuidBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, dc2Uuid_);
    }
    if (!getTypeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, type_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getSgUuidBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, sgUuid_);
    }
    if (!getDc2UuidBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, dc2Uuid_);
    }
    if (!getTypeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, type_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.didiyun.compute.v1.ListSgRuleCondition)) {
      return super.equals(obj);
    }
    com.didiyun.compute.v1.ListSgRuleCondition other = (com.didiyun.compute.v1.ListSgRuleCondition) obj;

    boolean result = true;
    result = result && getSgUuid()
        .equals(other.getSgUuid());
    result = result && getDc2Uuid()
        .equals(other.getDc2Uuid());
    result = result && getType()
        .equals(other.getType());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + SGUUID_FIELD_NUMBER;
    hash = (53 * hash) + getSgUuid().hashCode();
    hash = (37 * hash) + DC2UUID_FIELD_NUMBER;
    hash = (53 * hash) + getDc2Uuid().hashCode();
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getType().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.didiyun.compute.v1.ListSgRuleCondition parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.didiyun.compute.v1.ListSgRuleCondition parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.didiyun.compute.v1.ListSgRuleCondition parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.didiyun.compute.v1.ListSgRuleCondition parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.didiyun.compute.v1.ListSgRuleCondition parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.didiyun.compute.v1.ListSgRuleCondition parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.didiyun.compute.v1.ListSgRuleCondition parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.didiyun.compute.v1.ListSgRuleCondition parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.didiyun.compute.v1.ListSgRuleCondition parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.didiyun.compute.v1.ListSgRuleCondition parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.didiyun.compute.v1.ListSgRuleCondition parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.didiyun.compute.v1.ListSgRuleCondition parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.didiyun.compute.v1.ListSgRuleCondition prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code didi.cloud.compute.v1.ListSgRuleCondition}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:didi.cloud.compute.v1.ListSgRuleCondition)
      com.didiyun.compute.v1.ListSgRuleConditionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.didiyun.compute.v1.SgOuterClass.internal_static_didi_cloud_compute_v1_ListSgRuleCondition_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.didiyun.compute.v1.SgOuterClass.internal_static_didi_cloud_compute_v1_ListSgRuleCondition_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.didiyun.compute.v1.ListSgRuleCondition.class, com.didiyun.compute.v1.ListSgRuleCondition.Builder.class);
    }

    // Construct using com.didiyun.compute.v1.ListSgRuleCondition.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      sgUuid_ = "";

      dc2Uuid_ = "";

      type_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.didiyun.compute.v1.SgOuterClass.internal_static_didi_cloud_compute_v1_ListSgRuleCondition_descriptor;
    }

    @java.lang.Override
    public com.didiyun.compute.v1.ListSgRuleCondition getDefaultInstanceForType() {
      return com.didiyun.compute.v1.ListSgRuleCondition.getDefaultInstance();
    }

    @java.lang.Override
    public com.didiyun.compute.v1.ListSgRuleCondition build() {
      com.didiyun.compute.v1.ListSgRuleCondition result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.didiyun.compute.v1.ListSgRuleCondition buildPartial() {
      com.didiyun.compute.v1.ListSgRuleCondition result = new com.didiyun.compute.v1.ListSgRuleCondition(this);
      result.sgUuid_ = sgUuid_;
      result.dc2Uuid_ = dc2Uuid_;
      result.type_ = type_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.didiyun.compute.v1.ListSgRuleCondition) {
        return mergeFrom((com.didiyun.compute.v1.ListSgRuleCondition)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.didiyun.compute.v1.ListSgRuleCondition other) {
      if (other == com.didiyun.compute.v1.ListSgRuleCondition.getDefaultInstance()) return this;
      if (!other.getSgUuid().isEmpty()) {
        sgUuid_ = other.sgUuid_;
        onChanged();
      }
      if (!other.getDc2Uuid().isEmpty()) {
        dc2Uuid_ = other.dc2Uuid_;
        onChanged();
      }
      if (!other.getType().isEmpty()) {
        type_ = other.type_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.didiyun.compute.v1.ListSgRuleCondition parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.didiyun.compute.v1.ListSgRuleCondition) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object sgUuid_ = "";
    /**
     * <pre>
     *查看此SG下的SGRule列表
     * </pre>
     *
     * <code>string sgUuid = 1;</code>
     */
    public java.lang.String getSgUuid() {
      java.lang.Object ref = sgUuid_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        sgUuid_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     *查看此SG下的SGRule列表
     * </pre>
     *
     * <code>string sgUuid = 1;</code>
     */
    public com.google.protobuf.ByteString
        getSgUuidBytes() {
      java.lang.Object ref = sgUuid_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        sgUuid_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     *查看此SG下的SGRule列表
     * </pre>
     *
     * <code>string sgUuid = 1;</code>
     */
    public Builder setSgUuid(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      sgUuid_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *查看此SG下的SGRule列表
     * </pre>
     *
     * <code>string sgUuid = 1;</code>
     */
    public Builder clearSgUuid() {
      
      sgUuid_ = getDefaultInstance().getSgUuid();
      onChanged();
      return this;
    }
    /**
     * <pre>
     *查看此SG下的SGRule列表
     * </pre>
     *
     * <code>string sgUuid = 1;</code>
     */
    public Builder setSgUuidBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      sgUuid_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object dc2Uuid_ = "";
    /**
     * <pre>
     *查看此DC2遵循的SGRule列表
     * </pre>
     *
     * <code>string dc2Uuid = 2;</code>
     */
    public java.lang.String getDc2Uuid() {
      java.lang.Object ref = dc2Uuid_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        dc2Uuid_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     *查看此DC2遵循的SGRule列表
     * </pre>
     *
     * <code>string dc2Uuid = 2;</code>
     */
    public com.google.protobuf.ByteString
        getDc2UuidBytes() {
      java.lang.Object ref = dc2Uuid_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        dc2Uuid_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     *查看此DC2遵循的SGRule列表
     * </pre>
     *
     * <code>string dc2Uuid = 2;</code>
     */
    public Builder setDc2Uuid(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      dc2Uuid_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *查看此DC2遵循的SGRule列表
     * </pre>
     *
     * <code>string dc2Uuid = 2;</code>
     */
    public Builder clearDc2Uuid() {
      
      dc2Uuid_ = getDefaultInstance().getDc2Uuid();
      onChanged();
      return this;
    }
    /**
     * <pre>
     *查看此DC2遵循的SGRule列表
     * </pre>
     *
     * <code>string dc2Uuid = 2;</code>
     */
    public Builder setDc2UuidBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      dc2Uuid_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object type_ = "";
    /**
     * <pre>
     *要查询的SGRule类型，"Ingress"为入方向，"Egress"为出方向
     * </pre>
     *
     * <code>string type = 3;</code>
     */
    public java.lang.String getType() {
      java.lang.Object ref = type_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        type_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     *要查询的SGRule类型，"Ingress"为入方向，"Egress"为出方向
     * </pre>
     *
     * <code>string type = 3;</code>
     */
    public com.google.protobuf.ByteString
        getTypeBytes() {
      java.lang.Object ref = type_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        type_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     *要查询的SGRule类型，"Ingress"为入方向，"Egress"为出方向
     * </pre>
     *
     * <code>string type = 3;</code>
     */
    public Builder setType(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      type_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *要查询的SGRule类型，"Ingress"为入方向，"Egress"为出方向
     * </pre>
     *
     * <code>string type = 3;</code>
     */
    public Builder clearType() {
      
      type_ = getDefaultInstance().getType();
      onChanged();
      return this;
    }
    /**
     * <pre>
     *要查询的SGRule类型，"Ingress"为入方向，"Egress"为出方向
     * </pre>
     *
     * <code>string type = 3;</code>
     */
    public Builder setTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      type_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:didi.cloud.compute.v1.ListSgRuleCondition)
  }

  // @@protoc_insertion_point(class_scope:didi.cloud.compute.v1.ListSgRuleCondition)
  private static final com.didiyun.compute.v1.ListSgRuleCondition DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.didiyun.compute.v1.ListSgRuleCondition();
  }

  public static com.didiyun.compute.v1.ListSgRuleCondition getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListSgRuleCondition>
      PARSER = new com.google.protobuf.AbstractParser<ListSgRuleCondition>() {
    @java.lang.Override
    public ListSgRuleCondition parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ListSgRuleCondition(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ListSgRuleCondition> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListSgRuleCondition> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.didiyun.compute.v1.ListSgRuleCondition getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
