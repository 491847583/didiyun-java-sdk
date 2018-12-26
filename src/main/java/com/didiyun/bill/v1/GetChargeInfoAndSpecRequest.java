// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bill/v1/bill.proto

package com.didiyun.bill.v1;

/**
 * Protobuf type {@code didi.cloud.bill.v1.GetChargeInfoAndSpecRequest}
 */
public  final class GetChargeInfoAndSpecRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:didi.cloud.bill.v1.GetChargeInfoAndSpecRequest)
    GetChargeInfoAndSpecRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetChargeInfoAndSpecRequest.newBuilder() to construct.
  private GetChargeInfoAndSpecRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetChargeInfoAndSpecRequest() {
    resource_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetChargeInfoAndSpecRequest(
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
            com.didiyun.base.v1.Header.Builder subBuilder = null;
            if (header_ != null) {
              subBuilder = header_.toBuilder();
            }
            header_ = input.readMessage(com.didiyun.base.v1.Header.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(header_);
              header_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
              resource_ = new java.util.ArrayList<com.didiyun.bill.v1.GetChargeInfoInput>();
              mutable_bitField0_ |= 0x00000002;
            }
            resource_.add(
                input.readMessage(com.didiyun.bill.v1.GetChargeInfoInput.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
        resource_ = java.util.Collections.unmodifiableList(resource_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.didiyun.bill.v1.BillOuterClass.internal_static_didi_cloud_bill_v1_GetChargeInfoAndSpecRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.didiyun.bill.v1.BillOuterClass.internal_static_didi_cloud_bill_v1_GetChargeInfoAndSpecRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.didiyun.bill.v1.GetChargeInfoAndSpecRequest.class, com.didiyun.bill.v1.GetChargeInfoAndSpecRequest.Builder.class);
  }

  private int bitField0_;
  public static final int HEADER_FIELD_NUMBER = 1;
  private com.didiyun.base.v1.Header header_;
  /**
   * <pre>
   *公共的请求头
   * </pre>
   *
   * <code>.didi.cloud.base.v1.Header header = 1;</code>
   */
  public boolean hasHeader() {
    return header_ != null;
  }
  /**
   * <pre>
   *公共的请求头
   * </pre>
   *
   * <code>.didi.cloud.base.v1.Header header = 1;</code>
   */
  public com.didiyun.base.v1.Header getHeader() {
    return header_ == null ? com.didiyun.base.v1.Header.getDefaultInstance() : header_;
  }
  /**
   * <pre>
   *公共的请求头
   * </pre>
   *
   * <code>.didi.cloud.base.v1.Header header = 1;</code>
   */
  public com.didiyun.base.v1.HeaderOrBuilder getHeaderOrBuilder() {
    return getHeader();
  }

  public static final int RESOURCE_FIELD_NUMBER = 2;
  private java.util.List<com.didiyun.bill.v1.GetChargeInfoInput> resource_;
  /**
   * <code>repeated .didi.cloud.bill.v1.GetChargeInfoInput resource = 2;</code>
   */
  public java.util.List<com.didiyun.bill.v1.GetChargeInfoInput> getResourceList() {
    return resource_;
  }
  /**
   * <code>repeated .didi.cloud.bill.v1.GetChargeInfoInput resource = 2;</code>
   */
  public java.util.List<? extends com.didiyun.bill.v1.GetChargeInfoInputOrBuilder> 
      getResourceOrBuilderList() {
    return resource_;
  }
  /**
   * <code>repeated .didi.cloud.bill.v1.GetChargeInfoInput resource = 2;</code>
   */
  public int getResourceCount() {
    return resource_.size();
  }
  /**
   * <code>repeated .didi.cloud.bill.v1.GetChargeInfoInput resource = 2;</code>
   */
  public com.didiyun.bill.v1.GetChargeInfoInput getResource(int index) {
    return resource_.get(index);
  }
  /**
   * <code>repeated .didi.cloud.bill.v1.GetChargeInfoInput resource = 2;</code>
   */
  public com.didiyun.bill.v1.GetChargeInfoInputOrBuilder getResourceOrBuilder(
      int index) {
    return resource_.get(index);
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
    if (header_ != null) {
      output.writeMessage(1, getHeader());
    }
    for (int i = 0; i < resource_.size(); i++) {
      output.writeMessage(2, resource_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (header_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getHeader());
    }
    for (int i = 0; i < resource_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, resource_.get(i));
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
    if (!(obj instanceof com.didiyun.bill.v1.GetChargeInfoAndSpecRequest)) {
      return super.equals(obj);
    }
    com.didiyun.bill.v1.GetChargeInfoAndSpecRequest other = (com.didiyun.bill.v1.GetChargeInfoAndSpecRequest) obj;

    boolean result = true;
    result = result && (hasHeader() == other.hasHeader());
    if (hasHeader()) {
      result = result && getHeader()
          .equals(other.getHeader());
    }
    result = result && getResourceList()
        .equals(other.getResourceList());
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
    if (hasHeader()) {
      hash = (37 * hash) + HEADER_FIELD_NUMBER;
      hash = (53 * hash) + getHeader().hashCode();
    }
    if (getResourceCount() > 0) {
      hash = (37 * hash) + RESOURCE_FIELD_NUMBER;
      hash = (53 * hash) + getResourceList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.didiyun.bill.v1.GetChargeInfoAndSpecRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.didiyun.bill.v1.GetChargeInfoAndSpecRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.didiyun.bill.v1.GetChargeInfoAndSpecRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.didiyun.bill.v1.GetChargeInfoAndSpecRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.didiyun.bill.v1.GetChargeInfoAndSpecRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.didiyun.bill.v1.GetChargeInfoAndSpecRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.didiyun.bill.v1.GetChargeInfoAndSpecRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.didiyun.bill.v1.GetChargeInfoAndSpecRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.didiyun.bill.v1.GetChargeInfoAndSpecRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.didiyun.bill.v1.GetChargeInfoAndSpecRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.didiyun.bill.v1.GetChargeInfoAndSpecRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.didiyun.bill.v1.GetChargeInfoAndSpecRequest parseFrom(
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
  public static Builder newBuilder(com.didiyun.bill.v1.GetChargeInfoAndSpecRequest prototype) {
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
   * Protobuf type {@code didi.cloud.bill.v1.GetChargeInfoAndSpecRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:didi.cloud.bill.v1.GetChargeInfoAndSpecRequest)
      com.didiyun.bill.v1.GetChargeInfoAndSpecRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.didiyun.bill.v1.BillOuterClass.internal_static_didi_cloud_bill_v1_GetChargeInfoAndSpecRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.didiyun.bill.v1.BillOuterClass.internal_static_didi_cloud_bill_v1_GetChargeInfoAndSpecRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.didiyun.bill.v1.GetChargeInfoAndSpecRequest.class, com.didiyun.bill.v1.GetChargeInfoAndSpecRequest.Builder.class);
    }

    // Construct using com.didiyun.bill.v1.GetChargeInfoAndSpecRequest.newBuilder()
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
        getResourceFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (headerBuilder_ == null) {
        header_ = null;
      } else {
        header_ = null;
        headerBuilder_ = null;
      }
      if (resourceBuilder_ == null) {
        resource_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
      } else {
        resourceBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.didiyun.bill.v1.BillOuterClass.internal_static_didi_cloud_bill_v1_GetChargeInfoAndSpecRequest_descriptor;
    }

    @java.lang.Override
    public com.didiyun.bill.v1.GetChargeInfoAndSpecRequest getDefaultInstanceForType() {
      return com.didiyun.bill.v1.GetChargeInfoAndSpecRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.didiyun.bill.v1.GetChargeInfoAndSpecRequest build() {
      com.didiyun.bill.v1.GetChargeInfoAndSpecRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.didiyun.bill.v1.GetChargeInfoAndSpecRequest buildPartial() {
      com.didiyun.bill.v1.GetChargeInfoAndSpecRequest result = new com.didiyun.bill.v1.GetChargeInfoAndSpecRequest(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (headerBuilder_ == null) {
        result.header_ = header_;
      } else {
        result.header_ = headerBuilder_.build();
      }
      if (resourceBuilder_ == null) {
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          resource_ = java.util.Collections.unmodifiableList(resource_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.resource_ = resource_;
      } else {
        result.resource_ = resourceBuilder_.build();
      }
      result.bitField0_ = to_bitField0_;
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
      if (other instanceof com.didiyun.bill.v1.GetChargeInfoAndSpecRequest) {
        return mergeFrom((com.didiyun.bill.v1.GetChargeInfoAndSpecRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.didiyun.bill.v1.GetChargeInfoAndSpecRequest other) {
      if (other == com.didiyun.bill.v1.GetChargeInfoAndSpecRequest.getDefaultInstance()) return this;
      if (other.hasHeader()) {
        mergeHeader(other.getHeader());
      }
      if (resourceBuilder_ == null) {
        if (!other.resource_.isEmpty()) {
          if (resource_.isEmpty()) {
            resource_ = other.resource_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureResourceIsMutable();
            resource_.addAll(other.resource_);
          }
          onChanged();
        }
      } else {
        if (!other.resource_.isEmpty()) {
          if (resourceBuilder_.isEmpty()) {
            resourceBuilder_.dispose();
            resourceBuilder_ = null;
            resource_ = other.resource_;
            bitField0_ = (bitField0_ & ~0x00000002);
            resourceBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getResourceFieldBuilder() : null;
          } else {
            resourceBuilder_.addAllMessages(other.resource_);
          }
        }
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
      com.didiyun.bill.v1.GetChargeInfoAndSpecRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.didiyun.bill.v1.GetChargeInfoAndSpecRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.didiyun.base.v1.Header header_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.didiyun.base.v1.Header, com.didiyun.base.v1.Header.Builder, com.didiyun.base.v1.HeaderOrBuilder> headerBuilder_;
    /**
     * <pre>
     *公共的请求头
     * </pre>
     *
     * <code>.didi.cloud.base.v1.Header header = 1;</code>
     */
    public boolean hasHeader() {
      return headerBuilder_ != null || header_ != null;
    }
    /**
     * <pre>
     *公共的请求头
     * </pre>
     *
     * <code>.didi.cloud.base.v1.Header header = 1;</code>
     */
    public com.didiyun.base.v1.Header getHeader() {
      if (headerBuilder_ == null) {
        return header_ == null ? com.didiyun.base.v1.Header.getDefaultInstance() : header_;
      } else {
        return headerBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     *公共的请求头
     * </pre>
     *
     * <code>.didi.cloud.base.v1.Header header = 1;</code>
     */
    public Builder setHeader(com.didiyun.base.v1.Header value) {
      if (headerBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        header_ = value;
        onChanged();
      } else {
        headerBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     *公共的请求头
     * </pre>
     *
     * <code>.didi.cloud.base.v1.Header header = 1;</code>
     */
    public Builder setHeader(
        com.didiyun.base.v1.Header.Builder builderForValue) {
      if (headerBuilder_ == null) {
        header_ = builderForValue.build();
        onChanged();
      } else {
        headerBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     *公共的请求头
     * </pre>
     *
     * <code>.didi.cloud.base.v1.Header header = 1;</code>
     */
    public Builder mergeHeader(com.didiyun.base.v1.Header value) {
      if (headerBuilder_ == null) {
        if (header_ != null) {
          header_ =
            com.didiyun.base.v1.Header.newBuilder(header_).mergeFrom(value).buildPartial();
        } else {
          header_ = value;
        }
        onChanged();
      } else {
        headerBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     *公共的请求头
     * </pre>
     *
     * <code>.didi.cloud.base.v1.Header header = 1;</code>
     */
    public Builder clearHeader() {
      if (headerBuilder_ == null) {
        header_ = null;
        onChanged();
      } else {
        header_ = null;
        headerBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     *公共的请求头
     * </pre>
     *
     * <code>.didi.cloud.base.v1.Header header = 1;</code>
     */
    public com.didiyun.base.v1.Header.Builder getHeaderBuilder() {
      
      onChanged();
      return getHeaderFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     *公共的请求头
     * </pre>
     *
     * <code>.didi.cloud.base.v1.Header header = 1;</code>
     */
    public com.didiyun.base.v1.HeaderOrBuilder getHeaderOrBuilder() {
      if (headerBuilder_ != null) {
        return headerBuilder_.getMessageOrBuilder();
      } else {
        return header_ == null ?
            com.didiyun.base.v1.Header.getDefaultInstance() : header_;
      }
    }
    /**
     * <pre>
     *公共的请求头
     * </pre>
     *
     * <code>.didi.cloud.base.v1.Header header = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.didiyun.base.v1.Header, com.didiyun.base.v1.Header.Builder, com.didiyun.base.v1.HeaderOrBuilder> 
        getHeaderFieldBuilder() {
      if (headerBuilder_ == null) {
        headerBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.didiyun.base.v1.Header, com.didiyun.base.v1.Header.Builder, com.didiyun.base.v1.HeaderOrBuilder>(
                getHeader(),
                getParentForChildren(),
                isClean());
        header_ = null;
      }
      return headerBuilder_;
    }

    private java.util.List<com.didiyun.bill.v1.GetChargeInfoInput> resource_ =
      java.util.Collections.emptyList();
    private void ensureResourceIsMutable() {
      if (!((bitField0_ & 0x00000002) == 0x00000002)) {
        resource_ = new java.util.ArrayList<com.didiyun.bill.v1.GetChargeInfoInput>(resource_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.didiyun.bill.v1.GetChargeInfoInput, com.didiyun.bill.v1.GetChargeInfoInput.Builder, com.didiyun.bill.v1.GetChargeInfoInputOrBuilder> resourceBuilder_;

    /**
     * <code>repeated .didi.cloud.bill.v1.GetChargeInfoInput resource = 2;</code>
     */
    public java.util.List<com.didiyun.bill.v1.GetChargeInfoInput> getResourceList() {
      if (resourceBuilder_ == null) {
        return java.util.Collections.unmodifiableList(resource_);
      } else {
        return resourceBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .didi.cloud.bill.v1.GetChargeInfoInput resource = 2;</code>
     */
    public int getResourceCount() {
      if (resourceBuilder_ == null) {
        return resource_.size();
      } else {
        return resourceBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .didi.cloud.bill.v1.GetChargeInfoInput resource = 2;</code>
     */
    public com.didiyun.bill.v1.GetChargeInfoInput getResource(int index) {
      if (resourceBuilder_ == null) {
        return resource_.get(index);
      } else {
        return resourceBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .didi.cloud.bill.v1.GetChargeInfoInput resource = 2;</code>
     */
    public Builder setResource(
        int index, com.didiyun.bill.v1.GetChargeInfoInput value) {
      if (resourceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureResourceIsMutable();
        resource_.set(index, value);
        onChanged();
      } else {
        resourceBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .didi.cloud.bill.v1.GetChargeInfoInput resource = 2;</code>
     */
    public Builder setResource(
        int index, com.didiyun.bill.v1.GetChargeInfoInput.Builder builderForValue) {
      if (resourceBuilder_ == null) {
        ensureResourceIsMutable();
        resource_.set(index, builderForValue.build());
        onChanged();
      } else {
        resourceBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .didi.cloud.bill.v1.GetChargeInfoInput resource = 2;</code>
     */
    public Builder addResource(com.didiyun.bill.v1.GetChargeInfoInput value) {
      if (resourceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureResourceIsMutable();
        resource_.add(value);
        onChanged();
      } else {
        resourceBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .didi.cloud.bill.v1.GetChargeInfoInput resource = 2;</code>
     */
    public Builder addResource(
        int index, com.didiyun.bill.v1.GetChargeInfoInput value) {
      if (resourceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureResourceIsMutable();
        resource_.add(index, value);
        onChanged();
      } else {
        resourceBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .didi.cloud.bill.v1.GetChargeInfoInput resource = 2;</code>
     */
    public Builder addResource(
        com.didiyun.bill.v1.GetChargeInfoInput.Builder builderForValue) {
      if (resourceBuilder_ == null) {
        ensureResourceIsMutable();
        resource_.add(builderForValue.build());
        onChanged();
      } else {
        resourceBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .didi.cloud.bill.v1.GetChargeInfoInput resource = 2;</code>
     */
    public Builder addResource(
        int index, com.didiyun.bill.v1.GetChargeInfoInput.Builder builderForValue) {
      if (resourceBuilder_ == null) {
        ensureResourceIsMutable();
        resource_.add(index, builderForValue.build());
        onChanged();
      } else {
        resourceBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .didi.cloud.bill.v1.GetChargeInfoInput resource = 2;</code>
     */
    public Builder addAllResource(
        java.lang.Iterable<? extends com.didiyun.bill.v1.GetChargeInfoInput> values) {
      if (resourceBuilder_ == null) {
        ensureResourceIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, resource_);
        onChanged();
      } else {
        resourceBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .didi.cloud.bill.v1.GetChargeInfoInput resource = 2;</code>
     */
    public Builder clearResource() {
      if (resourceBuilder_ == null) {
        resource_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        resourceBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .didi.cloud.bill.v1.GetChargeInfoInput resource = 2;</code>
     */
    public Builder removeResource(int index) {
      if (resourceBuilder_ == null) {
        ensureResourceIsMutable();
        resource_.remove(index);
        onChanged();
      } else {
        resourceBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .didi.cloud.bill.v1.GetChargeInfoInput resource = 2;</code>
     */
    public com.didiyun.bill.v1.GetChargeInfoInput.Builder getResourceBuilder(
        int index) {
      return getResourceFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .didi.cloud.bill.v1.GetChargeInfoInput resource = 2;</code>
     */
    public com.didiyun.bill.v1.GetChargeInfoInputOrBuilder getResourceOrBuilder(
        int index) {
      if (resourceBuilder_ == null) {
        return resource_.get(index);  } else {
        return resourceBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .didi.cloud.bill.v1.GetChargeInfoInput resource = 2;</code>
     */
    public java.util.List<? extends com.didiyun.bill.v1.GetChargeInfoInputOrBuilder> 
         getResourceOrBuilderList() {
      if (resourceBuilder_ != null) {
        return resourceBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(resource_);
      }
    }
    /**
     * <code>repeated .didi.cloud.bill.v1.GetChargeInfoInput resource = 2;</code>
     */
    public com.didiyun.bill.v1.GetChargeInfoInput.Builder addResourceBuilder() {
      return getResourceFieldBuilder().addBuilder(
          com.didiyun.bill.v1.GetChargeInfoInput.getDefaultInstance());
    }
    /**
     * <code>repeated .didi.cloud.bill.v1.GetChargeInfoInput resource = 2;</code>
     */
    public com.didiyun.bill.v1.GetChargeInfoInput.Builder addResourceBuilder(
        int index) {
      return getResourceFieldBuilder().addBuilder(
          index, com.didiyun.bill.v1.GetChargeInfoInput.getDefaultInstance());
    }
    /**
     * <code>repeated .didi.cloud.bill.v1.GetChargeInfoInput resource = 2;</code>
     */
    public java.util.List<com.didiyun.bill.v1.GetChargeInfoInput.Builder> 
         getResourceBuilderList() {
      return getResourceFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.didiyun.bill.v1.GetChargeInfoInput, com.didiyun.bill.v1.GetChargeInfoInput.Builder, com.didiyun.bill.v1.GetChargeInfoInputOrBuilder> 
        getResourceFieldBuilder() {
      if (resourceBuilder_ == null) {
        resourceBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.didiyun.bill.v1.GetChargeInfoInput, com.didiyun.bill.v1.GetChargeInfoInput.Builder, com.didiyun.bill.v1.GetChargeInfoInputOrBuilder>(
                resource_,
                ((bitField0_ & 0x00000002) == 0x00000002),
                getParentForChildren(),
                isClean());
        resource_ = null;
      }
      return resourceBuilder_;
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


    // @@protoc_insertion_point(builder_scope:didi.cloud.bill.v1.GetChargeInfoAndSpecRequest)
  }

  // @@protoc_insertion_point(class_scope:didi.cloud.bill.v1.GetChargeInfoAndSpecRequest)
  private static final com.didiyun.bill.v1.GetChargeInfoAndSpecRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.didiyun.bill.v1.GetChargeInfoAndSpecRequest();
  }

  public static com.didiyun.bill.v1.GetChargeInfoAndSpecRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetChargeInfoAndSpecRequest>
      PARSER = new com.google.protobuf.AbstractParser<GetChargeInfoAndSpecRequest>() {
    @java.lang.Override
    public GetChargeInfoAndSpecRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetChargeInfoAndSpecRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetChargeInfoAndSpecRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetChargeInfoAndSpecRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.didiyun.bill.v1.GetChargeInfoAndSpecRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

