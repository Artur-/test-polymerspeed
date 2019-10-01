import "@polymer/polymer/polymer-legacy.js";
import "@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js";
import "@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js";

import { html } from "@polymer/polymer/lib/utils/html-tag.js";
import { PolymerElement } from "@polymer/polymer/polymer-element.js";

class MicroitemComponent extends PolymerElement {
  static get template() {
    return html`
      <style include="shared-styles">
        :host {
          display: block;
        }

        .outerItem {
          padding: 0;
          background: var(--lumo-base-color);
          height: 100%;
        }

        .innerItem {
          width: 100%;
          height: 100%;
          border: 1px solid var(--lumo-contrast-20pct);
        }

        h1,
        h3 {
          text-align: center;
          margin-top: 2px;
          margin-bottom: 2px;
          display: block;
          margin-left: auto;
          margin-right: auto;
          font-family: var(--lumo-font-family);
          color: var(--lumo-body-text-color);
        }

        h3.title {
          color: var(--lumo-primary-text-color);
        }

        h1 {
          font-size: 16px;
        }

        h3 {
          font-size: 13px;
        }
      </style>
      <vaadin-horizontal-layout class="outerItem">
        <vaadin-vertical-layout class="innerItem" id="vaadinVerticalLayout">
          <h3 class="title" id="title">Heading 3</h3>
          <h1 id="property">Heading 1</h1>
        </vaadin-vertical-layout>
      </vaadin-horizontal-layout>
    `;
  }

  static get is() {
    return "microitem-component";
  }

  static get properties() {
    return {
      // Declare your properties here.
    };
  }
}
customElements.define(MicroitemComponent.is, MicroitemComponent);
