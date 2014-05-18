package org.gwtbootstrap3.client.ui;

/*
 * #%L
 * GwtBootstrap3
 * %%
 * Copyright (C) 2013 GwtBootstrap3
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import org.gwtbootstrap3.client.ui.base.HasDataParent;
import org.gwtbootstrap3.client.ui.base.HasDataTarget;
import org.gwtbootstrap3.client.ui.base.HasDataToggle;
import org.gwtbootstrap3.client.ui.base.mixin.DataParentMixin;
import org.gwtbootstrap3.client.ui.base.mixin.DataTargetMixin;
import org.gwtbootstrap3.client.ui.base.mixin.DataToggleMixin;
import org.gwtbootstrap3.client.ui.constants.Styles;
import org.gwtbootstrap3.client.ui.constants.Toggle;
import org.gwtbootstrap3.client.ui.html.Div;
import org.gwtbootstrap3.client.ui.html.Text;

/**
 * @author Joshua Godi
 */
public class PanelHeader extends Div implements HasDataToggle, HasDataTarget, HasDataParent {
    private final DataParentMixin<PanelHeader> parentMixin = new DataParentMixin<PanelHeader>(this);
    private final DataTargetMixin<PanelHeader> targetMixin = new DataTargetMixin<PanelHeader>(this);
    private final DataToggleMixin<PanelHeader> toggleMixin = new DataToggleMixin<PanelHeader>(this);
    private final Text text = new Text();

    public PanelHeader() {
        setStyleName(Styles.PANEL_HEADING);
    }

    /**
     * Returns the text of the panel header.
     *
     * @return text of the panel header
     */
    public String getText() {
        return text.getText();
    }

    /**
     * Sets the text for the panel header
     *
     * @param text the text of the panel header
     */
    public void setText(final String text) {
        this.text.setText(text);
        insert(this.text, 0);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setDataTarget(final String dataTarget) {
        targetMixin.setDataTarget(dataTarget);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getDataTarget() {
        return targetMixin.getDataTarget();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setDataToggle(final Toggle toggle) {
        toggleMixin.setDataToggle(toggle);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Toggle getDataToggle() {
        return toggleMixin.getDataToggle();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setDataParent(final String dataParent) {
        parentMixin.setDataParent(dataParent);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getDataParent() {
        return parentMixin.getDataParent();
    }
}
