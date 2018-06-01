/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.zeppelin.interpreter.thrift;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2018-5-29")
public class RunParagraphsEvent implements org.apache.thrift.TBase<RunParagraphsEvent, RunParagraphsEvent._Fields>, java.io.Serializable, Cloneable, Comparable<RunParagraphsEvent> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("RunParagraphsEvent");

  private static final org.apache.thrift.protocol.TField NOTE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("noteId", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField PARAGRAPH_IDS_FIELD_DESC = new org.apache.thrift.protocol.TField("paragraphIds", org.apache.thrift.protocol.TType.LIST, (short)2);
  private static final org.apache.thrift.protocol.TField PARAGRAPH_INDICES_FIELD_DESC = new org.apache.thrift.protocol.TField("paragraphIndices", org.apache.thrift.protocol.TType.LIST, (short)3);
  private static final org.apache.thrift.protocol.TField CUR_PARAGRAPH_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("curParagraphId", org.apache.thrift.protocol.TType.STRING, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new RunParagraphsEventStandardSchemeFactory());
    schemes.put(TupleScheme.class, new RunParagraphsEventTupleSchemeFactory());
  }

  public String noteId; // required
  public List<String> paragraphIds; // required
  public List<Integer> paragraphIndices; // required
  public String curParagraphId; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    NOTE_ID((short)1, "noteId"),
    PARAGRAPH_IDS((short)2, "paragraphIds"),
    PARAGRAPH_INDICES((short)3, "paragraphIndices"),
    CUR_PARAGRAPH_ID((short)4, "curParagraphId");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // NOTE_ID
          return NOTE_ID;
        case 2: // PARAGRAPH_IDS
          return PARAGRAPH_IDS;
        case 3: // PARAGRAPH_INDICES
          return PARAGRAPH_INDICES;
        case 4: // CUR_PARAGRAPH_ID
          return CUR_PARAGRAPH_ID;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.NOTE_ID, new org.apache.thrift.meta_data.FieldMetaData("noteId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PARAGRAPH_IDS, new org.apache.thrift.meta_data.FieldMetaData("paragraphIds", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.PARAGRAPH_INDICES, new org.apache.thrift.meta_data.FieldMetaData("paragraphIndices", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32))));
    tmpMap.put(_Fields.CUR_PARAGRAPH_ID, new org.apache.thrift.meta_data.FieldMetaData("curParagraphId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(RunParagraphsEvent.class, metaDataMap);
  }

  public RunParagraphsEvent() {
  }

  public RunParagraphsEvent(
    String noteId,
    List<String> paragraphIds,
    List<Integer> paragraphIndices,
    String curParagraphId)
  {
    this();
    this.noteId = noteId;
    this.paragraphIds = paragraphIds;
    this.paragraphIndices = paragraphIndices;
    this.curParagraphId = curParagraphId;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public RunParagraphsEvent(RunParagraphsEvent other) {
    if (other.isSetNoteId()) {
      this.noteId = other.noteId;
    }
    if (other.isSetParagraphIds()) {
      List<String> __this__paragraphIds = new ArrayList<String>(other.paragraphIds);
      this.paragraphIds = __this__paragraphIds;
    }
    if (other.isSetParagraphIndices()) {
      List<Integer> __this__paragraphIndices = new ArrayList<Integer>(other.paragraphIndices);
      this.paragraphIndices = __this__paragraphIndices;
    }
    if (other.isSetCurParagraphId()) {
      this.curParagraphId = other.curParagraphId;
    }
  }

  public RunParagraphsEvent deepCopy() {
    return new RunParagraphsEvent(this);
  }

  @Override
  public void clear() {
    this.noteId = null;
    this.paragraphIds = null;
    this.paragraphIndices = null;
    this.curParagraphId = null;
  }

  public String getNoteId() {
    return this.noteId;
  }

  public RunParagraphsEvent setNoteId(String noteId) {
    this.noteId = noteId;
    return this;
  }

  public void unsetNoteId() {
    this.noteId = null;
  }

  /** Returns true if field noteId is set (has been assigned a value) and false otherwise */
  public boolean isSetNoteId() {
    return this.noteId != null;
  }

  public void setNoteIdIsSet(boolean value) {
    if (!value) {
      this.noteId = null;
    }
  }

  public int getParagraphIdsSize() {
    return (this.paragraphIds == null) ? 0 : this.paragraphIds.size();
  }

  public java.util.Iterator<String> getParagraphIdsIterator() {
    return (this.paragraphIds == null) ? null : this.paragraphIds.iterator();
  }

  public void addToParagraphIds(String elem) {
    if (this.paragraphIds == null) {
      this.paragraphIds = new ArrayList<String>();
    }
    this.paragraphIds.add(elem);
  }

  public List<String> getParagraphIds() {
    return this.paragraphIds;
  }

  public RunParagraphsEvent setParagraphIds(List<String> paragraphIds) {
    this.paragraphIds = paragraphIds;
    return this;
  }

  public void unsetParagraphIds() {
    this.paragraphIds = null;
  }

  /** Returns true if field paragraphIds is set (has been assigned a value) and false otherwise */
  public boolean isSetParagraphIds() {
    return this.paragraphIds != null;
  }

  public void setParagraphIdsIsSet(boolean value) {
    if (!value) {
      this.paragraphIds = null;
    }
  }

  public int getParagraphIndicesSize() {
    return (this.paragraphIndices == null) ? 0 : this.paragraphIndices.size();
  }

  public java.util.Iterator<Integer> getParagraphIndicesIterator() {
    return (this.paragraphIndices == null) ? null : this.paragraphIndices.iterator();
  }

  public void addToParagraphIndices(int elem) {
    if (this.paragraphIndices == null) {
      this.paragraphIndices = new ArrayList<Integer>();
    }
    this.paragraphIndices.add(elem);
  }

  public List<Integer> getParagraphIndices() {
    return this.paragraphIndices;
  }

  public RunParagraphsEvent setParagraphIndices(List<Integer> paragraphIndices) {
    this.paragraphIndices = paragraphIndices;
    return this;
  }

  public void unsetParagraphIndices() {
    this.paragraphIndices = null;
  }

  /** Returns true if field paragraphIndices is set (has been assigned a value) and false otherwise */
  public boolean isSetParagraphIndices() {
    return this.paragraphIndices != null;
  }

  public void setParagraphIndicesIsSet(boolean value) {
    if (!value) {
      this.paragraphIndices = null;
    }
  }

  public String getCurParagraphId() {
    return this.curParagraphId;
  }

  public RunParagraphsEvent setCurParagraphId(String curParagraphId) {
    this.curParagraphId = curParagraphId;
    return this;
  }

  public void unsetCurParagraphId() {
    this.curParagraphId = null;
  }

  /** Returns true if field curParagraphId is set (has been assigned a value) and false otherwise */
  public boolean isSetCurParagraphId() {
    return this.curParagraphId != null;
  }

  public void setCurParagraphIdIsSet(boolean value) {
    if (!value) {
      this.curParagraphId = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case NOTE_ID:
      if (value == null) {
        unsetNoteId();
      } else {
        setNoteId((String)value);
      }
      break;

    case PARAGRAPH_IDS:
      if (value == null) {
        unsetParagraphIds();
      } else {
        setParagraphIds((List<String>)value);
      }
      break;

    case PARAGRAPH_INDICES:
      if (value == null) {
        unsetParagraphIndices();
      } else {
        setParagraphIndices((List<Integer>)value);
      }
      break;

    case CUR_PARAGRAPH_ID:
      if (value == null) {
        unsetCurParagraphId();
      } else {
        setCurParagraphId((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case NOTE_ID:
      return getNoteId();

    case PARAGRAPH_IDS:
      return getParagraphIds();

    case PARAGRAPH_INDICES:
      return getParagraphIndices();

    case CUR_PARAGRAPH_ID:
      return getCurParagraphId();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case NOTE_ID:
      return isSetNoteId();
    case PARAGRAPH_IDS:
      return isSetParagraphIds();
    case PARAGRAPH_INDICES:
      return isSetParagraphIndices();
    case CUR_PARAGRAPH_ID:
      return isSetCurParagraphId();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof RunParagraphsEvent)
      return this.equals((RunParagraphsEvent)that);
    return false;
  }

  public boolean equals(RunParagraphsEvent that) {
    if (that == null)
      return false;

    boolean this_present_noteId = true && this.isSetNoteId();
    boolean that_present_noteId = true && that.isSetNoteId();
    if (this_present_noteId || that_present_noteId) {
      if (!(this_present_noteId && that_present_noteId))
        return false;
      if (!this.noteId.equals(that.noteId))
        return false;
    }

    boolean this_present_paragraphIds = true && this.isSetParagraphIds();
    boolean that_present_paragraphIds = true && that.isSetParagraphIds();
    if (this_present_paragraphIds || that_present_paragraphIds) {
      if (!(this_present_paragraphIds && that_present_paragraphIds))
        return false;
      if (!this.paragraphIds.equals(that.paragraphIds))
        return false;
    }

    boolean this_present_paragraphIndices = true && this.isSetParagraphIndices();
    boolean that_present_paragraphIndices = true && that.isSetParagraphIndices();
    if (this_present_paragraphIndices || that_present_paragraphIndices) {
      if (!(this_present_paragraphIndices && that_present_paragraphIndices))
        return false;
      if (!this.paragraphIndices.equals(that.paragraphIndices))
        return false;
    }

    boolean this_present_curParagraphId = true && this.isSetCurParagraphId();
    boolean that_present_curParagraphId = true && that.isSetCurParagraphId();
    if (this_present_curParagraphId || that_present_curParagraphId) {
      if (!(this_present_curParagraphId && that_present_curParagraphId))
        return false;
      if (!this.curParagraphId.equals(that.curParagraphId))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_noteId = true && (isSetNoteId());
    list.add(present_noteId);
    if (present_noteId)
      list.add(noteId);

    boolean present_paragraphIds = true && (isSetParagraphIds());
    list.add(present_paragraphIds);
    if (present_paragraphIds)
      list.add(paragraphIds);

    boolean present_paragraphIndices = true && (isSetParagraphIndices());
    list.add(present_paragraphIndices);
    if (present_paragraphIndices)
      list.add(paragraphIndices);

    boolean present_curParagraphId = true && (isSetCurParagraphId());
    list.add(present_curParagraphId);
    if (present_curParagraphId)
      list.add(curParagraphId);

    return list.hashCode();
  }

  @Override
  public int compareTo(RunParagraphsEvent other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetNoteId()).compareTo(other.isSetNoteId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNoteId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.noteId, other.noteId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetParagraphIds()).compareTo(other.isSetParagraphIds());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetParagraphIds()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.paragraphIds, other.paragraphIds);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetParagraphIndices()).compareTo(other.isSetParagraphIndices());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetParagraphIndices()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.paragraphIndices, other.paragraphIndices);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCurParagraphId()).compareTo(other.isSetCurParagraphId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCurParagraphId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.curParagraphId, other.curParagraphId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("RunParagraphsEvent(");
    boolean first = true;

    sb.append("noteId:");
    if (this.noteId == null) {
      sb.append("null");
    } else {
      sb.append(this.noteId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("paragraphIds:");
    if (this.paragraphIds == null) {
      sb.append("null");
    } else {
      sb.append(this.paragraphIds);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("paragraphIndices:");
    if (this.paragraphIndices == null) {
      sb.append("null");
    } else {
      sb.append(this.paragraphIndices);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("curParagraphId:");
    if (this.curParagraphId == null) {
      sb.append("null");
    } else {
      sb.append(this.curParagraphId);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class RunParagraphsEventStandardSchemeFactory implements SchemeFactory {
    public RunParagraphsEventStandardScheme getScheme() {
      return new RunParagraphsEventStandardScheme();
    }
  }

  private static class RunParagraphsEventStandardScheme extends StandardScheme<RunParagraphsEvent> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, RunParagraphsEvent struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // NOTE_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.noteId = iprot.readString();
              struct.setNoteIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // PARAGRAPH_IDS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list8 = iprot.readListBegin();
                struct.paragraphIds = new ArrayList<String>(_list8.size);
                String _elem9;
                for (int _i10 = 0; _i10 < _list8.size; ++_i10)
                {
                  _elem9 = iprot.readString();
                  struct.paragraphIds.add(_elem9);
                }
                iprot.readListEnd();
              }
              struct.setParagraphIdsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // PARAGRAPH_INDICES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list11 = iprot.readListBegin();
                struct.paragraphIndices = new ArrayList<Integer>(_list11.size);
                int _elem12;
                for (int _i13 = 0; _i13 < _list11.size; ++_i13)
                {
                  _elem12 = iprot.readI32();
                  struct.paragraphIndices.add(_elem12);
                }
                iprot.readListEnd();
              }
              struct.setParagraphIndicesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // CUR_PARAGRAPH_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.curParagraphId = iprot.readString();
              struct.setCurParagraphIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, RunParagraphsEvent struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.noteId != null) {
        oprot.writeFieldBegin(NOTE_ID_FIELD_DESC);
        oprot.writeString(struct.noteId);
        oprot.writeFieldEnd();
      }
      if (struct.paragraphIds != null) {
        oprot.writeFieldBegin(PARAGRAPH_IDS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.paragraphIds.size()));
          for (String _iter14 : struct.paragraphIds)
          {
            oprot.writeString(_iter14);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.paragraphIndices != null) {
        oprot.writeFieldBegin(PARAGRAPH_INDICES_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I32, struct.paragraphIndices.size()));
          for (int _iter15 : struct.paragraphIndices)
          {
            oprot.writeI32(_iter15);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.curParagraphId != null) {
        oprot.writeFieldBegin(CUR_PARAGRAPH_ID_FIELD_DESC);
        oprot.writeString(struct.curParagraphId);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class RunParagraphsEventTupleSchemeFactory implements SchemeFactory {
    public RunParagraphsEventTupleScheme getScheme() {
      return new RunParagraphsEventTupleScheme();
    }
  }

  private static class RunParagraphsEventTupleScheme extends TupleScheme<RunParagraphsEvent> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, RunParagraphsEvent struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetNoteId()) {
        optionals.set(0);
      }
      if (struct.isSetParagraphIds()) {
        optionals.set(1);
      }
      if (struct.isSetParagraphIndices()) {
        optionals.set(2);
      }
      if (struct.isSetCurParagraphId()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetNoteId()) {
        oprot.writeString(struct.noteId);
      }
      if (struct.isSetParagraphIds()) {
        {
          oprot.writeI32(struct.paragraphIds.size());
          for (String _iter16 : struct.paragraphIds)
          {
            oprot.writeString(_iter16);
          }
        }
      }
      if (struct.isSetParagraphIndices()) {
        {
          oprot.writeI32(struct.paragraphIndices.size());
          for (int _iter17 : struct.paragraphIndices)
          {
            oprot.writeI32(_iter17);
          }
        }
      }
      if (struct.isSetCurParagraphId()) {
        oprot.writeString(struct.curParagraphId);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, RunParagraphsEvent struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.noteId = iprot.readString();
        struct.setNoteIdIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TList _list18 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.paragraphIds = new ArrayList<String>(_list18.size);
          String _elem19;
          for (int _i20 = 0; _i20 < _list18.size; ++_i20)
          {
            _elem19 = iprot.readString();
            struct.paragraphIds.add(_elem19);
          }
        }
        struct.setParagraphIdsIsSet(true);
      }
      if (incoming.get(2)) {
        {
          org.apache.thrift.protocol.TList _list21 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I32, iprot.readI32());
          struct.paragraphIndices = new ArrayList<Integer>(_list21.size);
          int _elem22;
          for (int _i23 = 0; _i23 < _list21.size; ++_i23)
          {
            _elem22 = iprot.readI32();
            struct.paragraphIndices.add(_elem22);
          }
        }
        struct.setParagraphIndicesIsSet(true);
      }
      if (incoming.get(3)) {
        struct.curParagraphId = iprot.readString();
        struct.setCurParagraphIdIsSet(true);
      }
    }
  }

}
